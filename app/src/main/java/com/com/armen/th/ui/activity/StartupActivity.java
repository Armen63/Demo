package com.com.armen.th.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.com.armen.th.R;

public class StartupActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Handler handler = new Handler();

        handler.postDelayed(() -> {
            startActivity(new Intent(StartupActivity.this, MainActivity.class));
            finish();
        }, 1000);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_startup;
    }
}
