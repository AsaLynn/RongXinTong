package com.xuanyi.rxt;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.github.lzyzsd.jsbridge.BridgeWebViewClient;
import com.github.lzyzsd.jsbridge.IPageFinishListener;
import com.xuanyi.rxt.base.BaseWebViewActivity;
import com.xuanyi.rxt.constant.RxtCT;

public class BankNormalActivity extends BaseWebViewActivity implements IPageFinishListener {
    @Override
    protected void initContentView() {
        super.initContentView();
        //initTitleTv(true,"卡片申请");
    }

    @Override
    protected void loadUrl() {

        loadWebView(getIntent().getStringExtra(RxtCT.RI.CARD_URL));

    }

    @Override
    protected void initWebViewSettings() {
        super.initWebViewSettings();
        mWebView.setWebViewClient(new BridgeWebViewClient(mWebView, this){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // 接受所有证书
            }

        });
        //设置加载进来的页面自适应手机屏幕
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);//设置js可以直接打开窗口，如window.open()，默认为false
        webSettings.setDomStorageEnabled(true);
        webSettings.setDefaultTextEncodingName("gb2312");
        webSettings.setAllowFileAccess(true);
        //webSettings.setAllowFileAccessFromFileURLs(false);
       //bSettings.setAllowUniversalAccessFromFileURLs(false);
        //mWebView.loadUrl(<a target=_blank href="https://xxxxxxxx">https://xxxxxxxx</a>);
        mWebView.setInitialScale(25);//兼容Android 4.2
        //Android 4.2处理双击页面放大
        mWebView.setOnTouchListener(new View.OnTouchListener() {
            private long last_time;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        long current_time = System.currentTimeMillis();
                        long d_time = current_time - last_time;
                        if (d_time < 300) {
                            last_time = current_time;
                            return true;
                        } else {
                            last_time = current_time;
                        }
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public void onPageFinish(String url) {

    }

//    public void onPageFinish(String url) {
//        /*if (goFinish && url.contains(homeUrl)) {
//            finish();
//        }*/
//    }
}
