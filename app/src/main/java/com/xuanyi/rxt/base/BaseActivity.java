package com.xuanyi.rxt.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xuanyi.rxt.R;
import com.xuanyi.rxt.constant.RxtCT;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/10/3.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    protected static String TAG = "";
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_ll:
                finish();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getName();
        setContentView(getContentViewId());
        ButterKnife.bind(this);
        initContentView();
    }


    protected void initContentView() {
        initTitleTv(true, this.getIntent().getStringExtra(RxtCT.RI.RXT_IT));
    }

    protected abstract int getContentViewId();

    protected void initTitleTv(boolean isBack, String titleText) {
        initTitleView();
        initBackViewListener(isBack);
        titleTv.setText(titleText);
    }

    protected void initTitleIv(boolean isBack,int titleIcon) {
        initTitleView();
        initBackViewListener(isBack);
        titleTv.setVisibility(View.GONE);
        titleIv.setVisibility(View.VISIBLE);
        titleIv.setImageResource(titleIcon);
    }

    private void initBackViewListener(boolean isBack) {
        if (isBack) {
            back_ll.setVisibility(View.VISIBLE);
            back_ll.setOnClickListener(this);
        } else {
            back_ll.setVisibility(View.GONE);
        }
    }

    private void initTitleView() {
        //backIv = (ImageView) findViewById(R.id.back_iv);
        titleTv = (TextView) findViewById(R.id.title_tv);
        titleIv = (ImageView) findViewById(R.id.title_iv);
        back_ll = (LinearLayout) findViewById(R.id.back_ll);
    }

    //ImageView backIv;
    LinearLayout back_ll;
    TextView titleTv;
    ImageView titleIv;

}
