package com.kevin.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SharechatWeb extends AppCompatActivity {

    String url = "https://sharechat.com/";
    WebView sharechatweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharechat_web);
        sharechatweb = findViewById(R.id.sharechatweb);

        WebSettings settings = sharechatweb.getSettings();
        settings.setJavaScriptEnabled(true);
        sharechatweb.loadUrl(url);
    }
}