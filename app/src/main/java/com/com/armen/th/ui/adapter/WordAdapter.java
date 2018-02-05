package com.com.armen.th.ui.adapter;

/**
 * Created by Armen on 2/3/2018.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.com.armen.th.R;
import com.com.armen.th.db.Data;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final java.lang.String LOG_TAG = WordAdapter.class.getSimpleName();

    // ===========================================================
    // Fields
    // ===========================================================
    private ArrayList<String> mWordListForeign;
    static Typeface fontChanger;
    private OnItemClickListener mOnItemClickListener;

    // ===========================================================
    // Constructors
    // ===========================================================


    public WordAdapter(ArrayList<String >mWordListForeign, Typeface cFont, OnItemClickListener onItemClickListener) {
        this.mWordListForeign = mWordListForeign;
        this.mOnItemClickListener = onItemClickListener;

        fontChanger = cFont;
    }


    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.adapter_item_word, parent, false);
        return new WordViewHolder(view, mWordListForeign, mOnItemClickListener);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return mWordListForeign.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
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

    static class WordViewHolder extends RecyclerView.ViewHolder {

        Context context;
        TextView tvWordForeign;
        TextView tvWordEnglish;
        LinearLayout llItemContainer;
        ArrayList<String> wordArrayListForeign;
        OnItemClickListener onItemClickListener;


        WordViewHolder(View itemView, ArrayList<String> wordArrayListForeign, OnItemClickListener mOnItemClickListener) {
            super(itemView);
            this.wordArrayListForeign = wordArrayListForeign;
            this.context = itemView.getContext();
            this.onItemClickListener = mOnItemClickListener;
            findViews(itemView);
        }


        void findViews(View view) {
            llItemContainer = view.findViewById(R.id.ll_word_item_container);
            tvWordForeign = view.findViewById(R.id.tv_word_item_foreign);
            tvWordEnglish = view.findViewById(R.id.tv_word_item_english);

            tvWordEnglish.setTypeface(fontChanger);
            tvWordForeign.setTypeface(fontChanger);
        }

        void bind() {
            tvWordForeign.setText(wordArrayListForeign.get(getAdapterPosition()));
            tvWordEnglish.setText(java.lang.String.valueOf(Data.ENGLISH_WORDS.get(getAdapterPosition())));

            llItemContainer.setOnClickListener(v -> onItemClickListener.onItemClick(wordArrayListForeign.get(getAdapterPosition()), getAdapterPosition()));
        }
    }

    public interface OnItemClickListener {
        void onItemClick(String word, int position);
    }

}
