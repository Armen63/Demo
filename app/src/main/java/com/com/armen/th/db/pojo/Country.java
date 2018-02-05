package com.com.armen.th.db.pojo;

import android.support.annotation.DrawableRes;

/**
 * Created by andranikh on 5/27/17.
 */

public class Country {

    private @DrawableRes int picResId;
    private boolean selected;
    private String name;

    public Country(String name, int picResId) {
        this.name = name;
        this.picResId = picResId;
    }


    public int getPicResId() {
        return picResId;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
