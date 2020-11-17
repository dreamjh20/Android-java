package com.example.rsp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rsp.R;

public class Level extends AppCompatActivity {

    private ImageView imageview;
    public Button one_fight, ten_fight, hund_figiht;
    public static int cons = 0;
    public TextView txt_coin;
    public static int coinn = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
        imageview = findViewById(R.id.level_sin);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.spin_anim);
        imageview.startAnimation(animation);

        txt_coin = findViewById(R.id.coin_txt);
        txt_coin.setText(coinn);
        one_fight = findViewById(R.id.btn_one);
        ten_fight = findViewById(R.id.btn_ten);
        hund_figiht = findViewById(R.id.btn_hund);
        one_fight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons = 1;
                Intent intent = new Intent(Level.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ten_fight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons = 10;
                Intent intent = new Intent(Level.this, MainActivity.class);
                startActivity(intent);
            }
        });
        hund_figiht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cons = 100;
                Intent intent = new Intent(Level.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
