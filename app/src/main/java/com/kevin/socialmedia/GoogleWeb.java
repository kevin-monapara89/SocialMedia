package com.kevin.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GoogleWeb extends AppCompatActivity {

    String url = "https://www.google.com/";
    WebView googleweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_web);
        googleweb = findViewById(R.id.googleweb);

        WebSettings settings = googleweb.getSettings();
        settings.setJavaScriptEnabled(true);
        googleweb.loadUrl(url);
    }
}