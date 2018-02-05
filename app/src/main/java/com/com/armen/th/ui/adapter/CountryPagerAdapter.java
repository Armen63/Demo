package com.com.armen.th.ui.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.com.armen.th.R;
import com.com.armen.th.db.Data;
import com.squareup.picasso.Picasso;

/**
 * Created by Armen on 2/4/2018.
 */

public class CountryPagerAdapter extends PagerAdapter {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final String LOG_TAG = CountryPagerAdapter.class.getSimpleName();

    // ===========================================================
    // Fields
    // ===========================================================

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ImageView imageView;
    // ===========================================================
    // Constructors
    // ===========================================================

    public CountryPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Data.IMAGES.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        imageView = itemView.findViewById(R.id.ivImage);

        Picasso.with(itemView.getContext())
                .load(Data.IMAGES.get(position))
                .into(imageView);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public float getPageWidth(int position) {
        return 0.85f;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout) object);
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

}
