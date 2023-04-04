package com.kevin.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class InstagramWeb extends AppCompatActivity {

    String url = "https://www.instagram.com/instagram/?hl=en";
    WebView igweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_web);
        igweb = findViewById(R.id.igweb);

        WebSettings settings = igweb.getSettings();
        settings.setJavaScriptEnabled(true);
        igweb.loadUrl(url);
    }
}