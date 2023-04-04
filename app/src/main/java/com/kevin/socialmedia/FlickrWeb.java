package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FlickrWeb extends AppCompatActivity {

    String url = "https://www.flickr.com/";
    WebView flickrweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flickr_web);
        flickrweb = findViewById(R.id.flickr);

        WebSettings settings = flickrweb.getSettings();
        settings.setJavaScriptEnabled(true);
        flickrweb.loadUrl(url);
    }
}