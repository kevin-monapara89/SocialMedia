package com.kevin.socialmedia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView facebook, instagram, twitter, google, pintrest, snapchat, youtube, sharechat, netflix, linkedin, flickr, spotify, telegram, skype, blogger, vk, reddit, discord, github, yandex;
    @SuppressLint({"MissingInflatedId", "SetJavaScriptEnabled"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        twitter = findViewById(R.id.twitter);
        google = findViewById(R.id.google);
        pintrest = findViewById(R.id.pintrest);
        snapchat = findViewById(R.id.snapchat);
        youtube = findViewById(R.id.youtube);
        sharechat = findViewById(R.id.sharechat);
        netflix = findViewById(R.id.netflix);
        linkedin = findViewById(R.id.likedin);
        flickr = findViewById(R.id.flickr);
        spotify = findViewById(R.id.spotify);
        telegram = findViewById(R.id.telegram);
        skype = findViewById(R.id.skype);
        blogger = findViewById(R.id.blogger);
        vk = findViewById(R.id.vk);
        reddit = findViewById(R.id.reddit);
        discord = findViewById(R.id.discord);
        github = findViewById(R.id.github);
        yandex = findViewById(R.id.yandex);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FacebookWeb.class);
                startActivity(intent);
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InstagramWeb.class);
                startActivity(intent);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TwitterWeb.class);
                startActivity(intent);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GoogleWeb.class);
                startActivity(intent);
            }
        });
        pintrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PintrestWeb.class);
                startActivity(intent);
            }
        });
        snapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SnapchatWeb.class);
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YoutubeWeb.class);
                startActivity(intent);
            }
        });
        sharechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SharechatWeb.class);
                startActivity(intent);
            }
        });
        netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NetflixWeb.class);
                startActivity(intent);
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinkedinWeb.class);
                startActivity(intent);
            }
        });
        flickr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FlickrWeb.class);
                startActivity(intent);
            }
        });
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpotifyWeb.class);
                startActivity(intent);
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelegramWeb.class);
                startActivity(intent);
            }
        });
        skype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SkypeWeb.class);
                startActivity(intent);
            }
        });
        blogger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BloggerWeb.class);
                startActivity(intent);
            }
        });
        vk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VkWeb.class);
                startActivity(intent);
            }
        });
        reddit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RedditWeb.class);
                startActivity(intent);
            }
        });
        discord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DiscordWeb.class);
                startActivity(intent);
            }
        });
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GithubWeb.class);
                startActivity(intent);
            }
        });
        yandex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YandexWeb.class);
                startActivity(intent);
            }
        });
    }
}
