package com.com.armen.th.ui.activity;

import android.os.Bundle;

import com.com.armen.th.R;
import com.com.armen.th.ui.fragment.CircleFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_container, CircleFragment.newInstance())
                .addToBackStack(null)
                .commit();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

}
