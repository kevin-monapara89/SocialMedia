package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DiscordWeb extends AppCompatActivity {

    String url = "https://discord.com/channels/@me";
    WebView discordweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discord_web);
        discordweb = findViewById(R.id.discordweb);

        WebSettings settings = discordweb.getSettings();
        settings.setJavaScriptEnabled(true);
        discordweb.loadUrl(url);
    }
}