package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class GithubWeb extends AppCompatActivity {

    String url = "https://github.com/explore";
    WebView githubweb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_web);
        githubweb = findViewById(R.id.githubweb);

        WebSettings settings = githubweb.getSettings();
        settings.setJavaScriptEnabled(true);
        githubweb.loadUrl(url);
    }
}