package com.github.lzyzsd.jsbridge;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by Qi on 2016/7/22 0022.
 */
public class BridgeWebChromeClient extends WebChromeClient {

    BridgeWebView mWebView;
    IReceiveTitleListener mListener;
    public BridgeWebChromeClient(BridgeWebView webView) {
        this.mWebView = webView;
    }

    public BridgeWebChromeClient(BridgeWebView webView, IReceiveTitleListener listener) {
        this(webView);
        this.mListener = listener;
    }

    @Override
    public void onReceivedTitle(WebView view, String title) {
        super.onReceivedTitle(view, title);
        mWebView.title = title;
        if (mListener != null) {
            mListener.onReceiveTitle(title);
        }
    }

    @Override
    public void onProgressChanged(WebView view, int newProgress) {
        if (newProgress == 100) {
            mWebView.progressbar.setVisibility(View.GONE);
        } else {
            if (mWebView.progressbar.getVisibility() == View.GONE)
                mWebView.progressbar.setVisibility(View.VISIBLE);
            mWebView.progressbar.setProgress(newProgress);
        }
        super.onProgressChanged(view, newProgress);
    }

    public interface IReceiveTitleListener {
        void onReceiveTitle(String webTitle);
    }
}
