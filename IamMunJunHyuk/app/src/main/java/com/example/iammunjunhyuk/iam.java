package com.example.iammunjunhyuk;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class iam extends AppCompatActivity {

    ImageView flag;
    Button home;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iam);

        flag = (ImageView)findViewById(R.id.flag);
        flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(iam.this,rok.class);
                startActivity(intent);
            }
        });

        home = (Button)findViewById(R.id.home_iam);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(iam.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
