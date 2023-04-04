package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TwitterWeb extends AppCompatActivity {

    String url = "https://twitter.com/";
    WebView twtweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_web);
        twtweb = findViewById(R.id.twtweb);

        WebSettings settings = twtweb.getSettings();
        settings.setJavaScriptEnabled(true);
        twtweb.loadUrl(url);
    }
}