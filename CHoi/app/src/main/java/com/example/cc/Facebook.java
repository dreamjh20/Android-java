package com.example.cc;

import android.os.Bundle;
import android.webkit.WebView;

public class Facebook {
    private WebView webView;
    private String url = "https://www.facebook.com/moon.from.Mokpo"


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook);
    }
}
