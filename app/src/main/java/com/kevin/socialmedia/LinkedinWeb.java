package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class LinkedinWeb extends AppCompatActivity {

    String url = "https://www.linkedin.com/";
    WebView linkedinweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin_web);
        linkedinweb = findViewById(R.id.linkedinweb);

        WebSettings settings = linkedinweb.getSettings();
        settings.setJavaScriptEnabled(true);
        linkedinweb.loadUrl(url);
    }
}