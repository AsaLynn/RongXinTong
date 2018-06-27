package com.xuanyi.rxt;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xuanyi.rxt.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void initContentView() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //startLogin();
                startHome();
            }
        },2000);
    }

    private Handler handler = new Handler();

    @Override
    protected int getContentViewId() {
        return R.layout.activity_splash;
    }

    private void startHome() {
        Intent intent = new Intent();
        intent.setClass(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }

    private void startLogin() {
        Intent intent = new Intent();
        intent.setClass(this,LoginActivity.class);
        startActivity(intent);
    }

}
