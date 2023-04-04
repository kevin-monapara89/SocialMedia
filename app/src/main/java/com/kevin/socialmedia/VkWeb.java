package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class VkWeb extends AppCompatActivity {

    String url = "https://vk.company/en/";
    WebView vkweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vk_web);
        vkweb = findViewById(R.id.vkweb);

        WebSettings settings = vkweb.getSettings();
        settings.setJavaScriptEnabled(true);
        vkweb.loadUrl(url);
    }
}