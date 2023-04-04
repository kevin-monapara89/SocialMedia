package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class RedditWeb extends AppCompatActivity {

    String url = "https://www.reddit.com/";
    WebView redditweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reddit_web);
        redditweb = findViewById(R.id.redditweb);

        WebSettings settings = redditweb.getSettings();
        settings.setJavaScriptEnabled(true);
        redditweb.loadUrl(url);
    }
}