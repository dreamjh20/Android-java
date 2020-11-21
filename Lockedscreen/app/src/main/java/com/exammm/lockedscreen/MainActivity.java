package com.exammm.lockedscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat dtNow = new SimpleDateFormat("MM"+"월 "+"dd"+"일 "+"EE"+"요일");
    String formatDate = dtNow.format(date);
    TextView dateNow, timeNow;
    ImageButton cam;
    Button touch;

//    public boolean onTouchEvent(View view, MotionEvent event) {
//      return super.onTouchEvent(event);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        public void onReceive(Context context, Intent intent) {
//            if(intent.getAction().equals(Intent.ACTION_SCREEN_ON))
//            {
//                Log.e("onReceive", "SCREEN_ON");
//                Intent i = new Intent(context, LockActivity.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, i, 0);
//                try {
//                    pendingIntent.send();
//                }catch (PendingIntent.CanceledException e){
//                    e.printStackTrace();
//                }
//            }
//            else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF))
//            {
//                Log.e("onReceive", "SCREEN_OFF");
//            }
//            else if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
//            {
//                Log.e("onReceive", "BOOT_COMPLETED");
//            }
//        }

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON |
                WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);

        setContentView(R.layout.activity_main);
//        createGUI();
        dateNow = findViewById(R.id.date_now);
        //timeNow = findViewById(R.id.time_now);
        dateNow.setText(formatDate);
        //.setText(formatTime);

        touch = findViewById(R.id.touch1);
//        touch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, PasswordActivity.class);
//                startActivity(intent);
//            }
//        });
        cam = findViewById(R.id.cam_btn);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
    }
}