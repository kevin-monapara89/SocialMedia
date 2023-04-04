package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PintrestWeb extends AppCompatActivity {

    String url = "https://in.pinterest.com/";
    WebView pintrestweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pintrest_web);
        pintrestweb = findViewById(R.id.pintrestweb);

        WebSettings settings = pintrestweb.getSettings();
        settings.setJavaScriptEnabled(true);
        pintrestweb.loadUrl(url);

    }
}