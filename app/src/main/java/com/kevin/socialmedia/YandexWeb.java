package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class YandexWeb extends AppCompatActivity {

    String url = "https://yandex.com/images/";
    WebView yandexweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yandex_web);
        yandexweb = findViewById(R.id.yandexweb);

        WebSettings settings = yandexweb.getSettings();
        settings.setJavaScriptEnabled(true);
        yandexweb.loadUrl(url);
    }
}