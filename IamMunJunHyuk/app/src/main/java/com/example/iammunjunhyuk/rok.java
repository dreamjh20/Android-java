package com.example.iammunjunhyuk;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class rok extends AppCompatActivity {

    private WebView webView;
    private String url = "https://www.google.com/search?q=republic+of+korea&oq=Republic+of+Korea&aqs=chrome.0.0j46j0l6.5282j0j9&sourceid=chrome&ie=UTF-8";

    Button back;
    Button home;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rok);


        webView = (WebView) findViewById(R.id.web_rok);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new rok.WebViewClientClass());

        back = (Button)findViewById(R.id.back_rok);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rok.this, iam.class);
                startActivity(intent);
            }
        });

        home = (Button)findViewById(R.id.home_rok);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rok.this, MainActivity.class);
                startActivity((intent));
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public static class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }


    }
}
