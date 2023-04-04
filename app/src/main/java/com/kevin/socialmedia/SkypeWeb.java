package com.kevin.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SkypeWeb extends AppCompatActivity {

    String url = "https://www.skype.com/en/get-skype/";
    WebView skypeweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skype_web);
        skypeweb = findViewById(R.id.skypeweb);

        WebSettings settings = skypeweb.getSettings();
        settings.setJavaScriptEnabled(true);
        skypeweb.loadUrl(url);
    }
}