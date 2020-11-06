package com.examn.lockedscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();
    // 현재시간을 date 변수에 저장한다.
    Date date = new Date(now);
    // 시간을 나타냇 포맷을 정한다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
    SimpleDateFormat dtNow = new SimpleDateFormat("MM"+"월 "+"dd"+"일 "+"EE"+"요일");
    String formatDate = dtNow.format(date);
    SimpleDateFormat tmNow = new SimpleDateFormat("HH:mm");
    String formatTime = tmNow.format(date);
    TextView dateNow, timeNow;

//    public boolean onTouchEvent(View view, MotionEvent event) {
//      return super.onTouchEvent(event);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//
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
        timeNow = findViewById(R.id.time_now);
        dateNow.setText(formatDate);
        timeNow.setText(formatTime);
    }
}