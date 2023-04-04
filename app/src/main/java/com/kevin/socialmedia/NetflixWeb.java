package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NetflixWeb extends AppCompatActivity {

    String url = "https://www.netflix.com/in/";
    WebView netflixweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix_web);

        netflixweb = findViewById(R.id.netflixweb);

        WebSettings settings = netflixweb.getSettings();
        settings.setJavaScriptEnabled(true);
        netflixweb.loadUrl(url);
    }
}