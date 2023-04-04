package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TelegramWeb extends AppCompatActivity {

    String url = "https://telegram.org/";
    WebView telegramweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telegram_web);
        telegramweb = findViewById(R.id.telegramweb);

        WebSettings settings = telegramweb.getSettings();
        settings.setJavaScriptEnabled(true);
        telegramweb.loadUrl(url);
    }
}