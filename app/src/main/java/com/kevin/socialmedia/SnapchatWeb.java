package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SnapchatWeb extends AppCompatActivity {

    String url = "https://www.snapchat.com/";
    WebView snapchatweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapchat_web);

        snapchatweb = findViewById(R.id.snapchatweb);

        WebSettings settings = snapchatweb.getSettings();
        settings.setJavaScriptEnabled(true);
        snapchatweb.loadUrl(url);
    }
}