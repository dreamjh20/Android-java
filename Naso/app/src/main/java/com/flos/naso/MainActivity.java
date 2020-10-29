package com.flos.naso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private String url = "https://nasonaso.shop/";
    public ImageButton end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        end = findViewById(R.id.finish);



        webView = (WebView) findViewById(R.id.nasoview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClientClass());


        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //android.os.Process.killProcess(android.os.Process.myPid());
                //moveTaskToBack(true);
                //finishAndRemoveTask();
                //ActivityCompat.finishAffinity(MainActivity.this);
//
//                moveTaskToBack(true);
//                finish();
//                android.os.Process.killProcess(android.os.Process.myPid());

                finishAffinity();
                System.runFinalization();
                System.exit(0);
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