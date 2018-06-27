package com.xuanyi.rxt.base;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.github.lzyzsd.jsbridge.BridgeWebChromeClient;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.xuanyi.rxt.R;
import com.zxning.library.tool.NetUtils;
import com.zxning.library.tool.UIUtils;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 2016.07.16
 */
public abstract class BaseWebViewActivity extends BaseActivity {

    @BindView(R.id.wv_bridge)
    public BridgeWebView mWebView;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_basewebview;
    }

    LinearLayout ll_error;
    String url = "";

    @Override
    protected void initContentView() {
        super.initContentView();
        loadView();
    }

    private void loadView() {
        if (!NetUtils.isNetworkAvailable()) {
            UIUtils.showMsg("网络不可用！");
            mWebView.setVisibility(View.GONE);
        } else {
            initWebViewSettings();
            loadUrl();
        }
    }

    protected abstract void loadUrl();

    protected void initWebViewSettings() {
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setDomStorageEnabled(true);
        webSettings.setAppCacheMaxSize(1024 * 1024 * 4);
        webSettings.setAppCachePath(getCacheDir().getAbsolutePath());
        webSettings.setAllowFileAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        mWebView.setWebChromeClient(new BridgeWebChromeClient(mWebView){
            @Override
            public boolean onJsAlert(WebView view, String url, String message,
                                     JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }
            @Override
            public boolean onJsBeforeUnload(WebView view, String url,
                                           String message, JsResult result) {
                return super.onJsBeforeUnload(view, url, message, result);
            }
            @Override
            public boolean onJsConfirm(WebView view, String url,
                                      String message, JsResult result) {
                return super.onJsConfirm(view, url, message, result);
            }
            @Override
            public boolean onJsPrompt(WebView view, String url, String message,
                                     String defaultValue, JsPromptResult result) {
                return super.onJsPrompt(view, url, message, defaultValue, result);
            }
            @Override
            public boolean onJsTimeout() {
                return super.onJsTimeout();
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        super.onClick(v);
////        if (v.getId() == R.id.ll_error) {
////            loadView();
////        }
//    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            handleBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void handleBack() {
        if (mWebView.canGoBack()) {
            if (mWebView.getUrl().contains(url)) {//SEEM NO USE
                finish();
            } else {
                mWebView.goBack();
            }
        } else {
            onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        if (mWebView != null) {
            mWebView.stopLoading();
            mWebView.destroy();
            mWebView = null;
        }
        super.onDestroy();
    }

    protected void loadWebView(String url) {
        mWebView.loadUrl(url);
        //mWebView.loadDataWithBaseURL();
    }


}