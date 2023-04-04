package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BloggerWeb extends AppCompatActivity {

    String url = "https://www.blogger.com/about/?hl=hi";
    WebView bloggerweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogger_web);
        bloggerweb = findViewById(R.id.bloggerweb);

        WebSettings settings = bloggerweb.getSettings();
        settings.setJavaScriptEnabled(true);
        bloggerweb.loadUrl(url);
    }
}