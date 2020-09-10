package com.example.mysns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button btn_facebook;
    private Button btn_instagram;
    private Button btn_github;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_facebook = findViewById(R.id.btn_facebook);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FbActivity.class);
                startActivity(intent);
            }
        });
        btn_instagram = findViewById(R.id.btn_instagram);
        btn_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InActivity.class);
                startActivity(intent);
            }
        });

        btn_github = findViewById(R.id.btn_github);
        btn_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GitActivity.class);
                startActivity(intent);
            }
        });
    }
}