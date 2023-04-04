package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class YoutubeWeb extends AppCompatActivity {

    String url = "https://www.youtube.com/";
    WebView youtubeweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_web);

        youtubeweb = findViewById(R.id.youtubeweb);

        WebSettings settings = youtubeweb.getSettings();
        settings.setJavaScriptEnabled(true);
        youtubeweb.loadUrl(url);
    }
}