package com.example.rsp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity {

    private ImageView img_intro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        img_intro = findViewById(R.id.intro_img);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        img_intro.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(Intro.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, 3000);

    }
}
