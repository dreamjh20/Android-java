package com.example.iammunjunhyuk;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sns extends AppCompatActivity {

    private ImageView img_facebook;
    private ImageView img_instagram;
    private ImageView img_github;
    Button home;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sns);

        img_facebook = findViewById(R.id.img_facebook);
        img_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sns.this, facebook.class);
                startActivity(intent);
            }
        });

        img_instagram = findViewById(R.id.img_instagram);
        img_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sns.this, instagram.class);
                startActivity(intent);
            }
        });

        img_github = findViewById(R.id.img_github);
        img_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sns.this, github.class);
                startActivity(intent);
            }
        });

        home = findViewById(R.id.home_sns);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sns.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
