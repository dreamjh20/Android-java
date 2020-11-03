package com.example.rsp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView p_img, c_img, c_face;
    private TextView com, player;
    private int cs, ps;
    private int rand_num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com = findViewById(R.id.com_score);
        player = findViewById(R.id.player_score);
        p_img = findViewById(R.id.img_player);
        c_img = findViewById(R.id.img_com);
        c_face = findViewById(R.id.com_face);
//        cs = Integer.parseInt(com.getText().toString()) + 1;
//        ps = Integer.parseInt(com.getText().toString()) + 1;

        ImageButton b_scissors = (ImageButton)findViewById(R.id.btn_scissors);
        ImageButton b_rock = (ImageButton)findViewById(R.id.btn_rock);
        ImageButton b_paper = (ImageButton)findViewById(R.id.btn_paper);

//        b_scissors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                cs = Integer.parseInt(com.getText().toString()) + 1;
//                com.setText(Integer.toString(cs));
//            }
//        });



        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_img.setImageResource(R.drawable.ppaper);
//                System.out.println((int)(Math.random()*10000)%3 +1);
                rand_num = (int)(Math.random()*10000)%3 +1;
                System.out.println(rand_num);
                if (rand_num == 1){
                    c_img.setImageResource(R.drawable.tilted_paper);
                    c_face.setImageResource(R.drawable.sinsinnani);
                }
                else if (rand_num == 2){
                    c_img.setImageResource(R.drawable.tilted_rock);
                    ps = Integer.parseInt(player.getText().toString()) + 1;
                    player.setText(Integer.toString(ps));
                    c_face.setImageResource(R.drawable.lose);
                }
                else {
                    c_img.setImageResource(R.drawable.tilted_scissors);
                    cs = Integer.parseInt(com.getText().toString()) + 1;
                    com.setText(Integer.toString(cs));
                    c_face.setImageResource(R.drawable.win);
                }
            }
        });
        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_img.setImageResource(R.drawable.rrock);
                rand_num = (int)(Math.random()*10000)%3 +1;
                if (rand_num == 1){
                    c_img.setImageResource(R.drawable.tilted_paper);
                    cs = Integer.parseInt(com.getText().toString()) + 1;
                    com.setText(Integer.toString(cs));
                    c_face.setImageResource(R.drawable.win);
                }
                else if (rand_num == 2){
                    c_img.setImageResource(R.drawable.tilted_rock);
                    c_face.setImageResource(R.drawable.sinsinnani);
                }
                else {
                    c_img.setImageResource(R.drawable.tilted_scissors);
                    ps = Integer.parseInt(player.getText().toString()) + 1;
                    player.setText(Integer.toString(ps));
                    c_face.setImageResource(R.drawable.lose);
                }
            }
        });
        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p_img.setImageResource(R.drawable.sscissors);
                rand_num = (int)(Math.random()*10000)%3 +1;
                if (rand_num == 1){
                    c_img.setImageResource(R.drawable.tilted_paper);
                    ps = Integer.parseInt(player.getText().toString()) + 1;
                    player.setText(Integer.toString(ps));
                    c_face.setImageResource(R.drawable.lose);
                }
                else if (rand_num == 2){
                    c_img.setImageResource(R.drawable.tilted_rock);
                    cs = Integer.parseInt(com.getText().toString()) + 1;
                    com.setText(Integer.toString(cs));
                    c_face.setImageResource(R.drawable.win);
                }
                else {
                    c_img.setImageResource(R.drawable.tilted_scissors);
                    c_face.setImageResource(R.drawable.sinsinnani);
                }
            }
        });

    }
}