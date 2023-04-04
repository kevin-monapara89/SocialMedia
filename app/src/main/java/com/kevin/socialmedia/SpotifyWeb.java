package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SpotifyWeb extends AppCompatActivity {
    String url = "https://open.spotify.com/";
    WebView spotifyweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify_web);
        spotifyweb = findViewById(R.id.spotify);

        WebSettings settings = spotifyweb.getSettings();
        settings.setJavaScriptEnabled(true);
        spotifyweb.loadUrl(url);
    }
}