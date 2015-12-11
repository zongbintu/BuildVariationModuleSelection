package com.tu.variation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.tu.mylibrary.VariationTest;
import com.zongyou.library.widget.ProgressWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressWebView webView = (ProgressWebView) findViewById(R.id.flavor_webview);
        webView.setProgressWebView(android.R.attr.progressBarStyleHorizontal);
        webView.setOnProgressTypeLinterner(new ProgressWebView.OnProgressTypeLinterner() {

            @Override
            public void endType(WebView view, ProgressBar progressbar) {

            }

            @Override
            public void startType(WebView view, ProgressBar progressbar) {

            }

        });
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(VariationTest.domain);
    }
}
