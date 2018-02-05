package com.com.armen.th.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.com.armen.th.R;
import com.com.armen.th.db.pojo.Country;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Armen on 2/1/2018.
 */

public class CountryFlagCircleAdapter extends RecyclerView.Adapter<CountryFlagCircleAdapter.DecoratedViewHolder> {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final String LOG_TAG = CountryFlagCircleAdapter.class.getSimpleName();

    // ===========================================================
    // Fields
    // ===========================================================

    public List<Country> data;
    private DecoratedViewHolder.OnItemSelectedListener onItemSelectedListener;

    // ===========================================================
    // Constructors
    // ===========================================================

    public CountryFlagCircleAdapter(List<Country> data, DecoratedViewHolder.OnItemSelectedListener onItemSelectedListener) {
        this.data = data;
        this.onItemSelectedListener = onItemSelectedListener;
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================

    @Override
    public DecoratedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_circle, parent, false);
        return new DecoratedViewHolder(view, onItemSelectedListener);
    }

    @Override
    public void onBindViewHolder(DecoratedViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // ===========================================================
    // Other Listeners, methods for/from Interfaces
    // ===========================================================

    // ===========================================================
    // Click Listeners
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

    public static class DecoratedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Country data;
        private View root;
        private ImageView avatarIv;
        private ImageView avatarSelectedIv;
        private DecoratedViewHolder.OnItemSelectedListener onItemSelectedListener;

        public DecoratedViewHolder(View itemView, DecoratedViewHolder.OnItemSelectedListener onItemSelectedListener) {
            super(itemView);
            this.onItemSelectedListener = onItemSelectedListener;

            root = itemView.findViewById(R.id.carousel_parent_layout);
            avatarIv = itemView.findViewById(R.id.image_carousel_item);
            avatarSelectedIv = itemView.findViewById(R.id.image_selected);
            root.setOnClickListener(this);
        }

        void bind(Country data) {
            this.data = data;

            Picasso.with(itemView.getContext())
                    .load(data.getPicResId())
                    .placeholder(R.drawable.placeholder)
                    .into(avatarIv);

            if (data.isSelected()) {
                avatarSelectedIv.setVisibility(View.VISIBLE);
            } else {
                avatarSelectedIv.setVisibility(View.GONE);
            }
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.carousel_parent_layout) {
                if (onItemSelectedListener != null) {
                    onItemSelectedListener.onItemSelected(data);
                }
            }
        }

        public interface OnItemSelectedListener {
            void onItemSelected(Country item);
        }
    }
}
