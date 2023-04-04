package com.kevin.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FacebookWeb extends AppCompatActivity {
    String url = "https://www.facebook.com/";
    WebView fbweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_web);

        fbweb = findViewById(R.id.fbweb);

        WebSettings settings = fbweb.getSettings();
        settings.setJavaScriptEnabled(true);
        fbweb.loadUrl(url);
    }
}