package com.example.rsp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.rsp.Level.cons;

public class MainActivity extends AppCompatActivity {

    private ImageView p_img, c_img, c_face;
    private TextView com, player;
    private int cs, ps;
    private int rand_num = 0;
    public int coin;

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

        Level lv = new Level();
        lv.
        final ImageButton b_scissors = (ImageButton)findViewById(R.id.btn_scissors);
        final ImageButton b_rock = (ImageButton)findViewById(R.id.btn_rock);
        ImageButton b_paper = (ImageButton)findViewById(R.id.btn_paper);

//        b_scissors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                cs = Integer.parseInt(com.getText().toString()) + 1;
//                com.setText(Integer.toString(cs));
//            }
//        });


//        System.out.println("----------------------------------------" + cons + "-------------------------------------------------------");

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final Handler mHandler = new Handler();
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
                    if (ps == cons){
//                        builder.setTitle("축하합니다").setMessage("이겼습니다!!");
//                        AlertDialog alertDialog = builder.create();
//                        alertDialog.show();

                        coin++;

                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                builder.setTitle("승리").setMessage("신난다~!");
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }
                }
                else {
                    c_img.setImageResource(R.drawable.tilted_scissors);
                    cs = Integer.parseInt(com.getText().toString()) + 1;
                    com.setText(Integer.toString(cs));
                    c_face.setImageResource(R.drawable.win);

                    if (cs == cons){
//                        builder.setTitle("졌습니다").setMessage("혼내줍시다!!");
//                        AlertDialog alertDialog = builder.create();
//                        alertDialog.show();
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {
                                builder.setTitle("패배").setMessage("푸하하");
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }
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

                    if (cs == cons){
//                        builder.setTitle("졌습니다").setMessage("혼내줍시다!!");
//                        AlertDialog alertDialog = builder.create();
//                        alertDialog.show();
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {

                                builder.setTitle("패배").setMessage("푸하하");
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }

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
                    if (ps == cons){
//                        builder.setTitle("축하합니다").setMessage("이겼습니다!!");
//                        AlertDialog alertDialog = builder.create();
//                        alertDialog.show();

                        coin++;

                        mHandler.postDelayed(new Runnable()  {
                            public void run() {

                                builder.setTitle("승리").setMessage("신난다~!");
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }
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
                    if (ps == cons){

                        coin++;

                        builder.setTitle("승리").setMessage("신난다~!");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {

                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }
                }
                else if (rand_num == 2){
                    c_img.setImageResource(R.drawable.tilted_rock);
                    cs = Integer.parseInt(com.getText().toString()) + 1;
                    com.setText(Integer.toString(cs));
                    c_face.setImageResource(R.drawable.win);

                    if (cs == cons){
                        builder.setTitle("졌습니다").setMessage("혼내줍시다!!");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        mHandler.postDelayed(new Runnable()  {
                            public void run() {

                                Intent intent = new Intent(MainActivity.this, Level.class);
                                startActivity(intent);
                            }
                        }, 400);

                    }
                }
                else {
                    c_img.setImageResource(R.drawable.tilted_scissors);
                    c_face.setImageResource(R.drawable.sinsinnani);
                }
            }
        });
//        System.out.println(coin);
    }
}