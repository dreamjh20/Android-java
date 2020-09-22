package com.example.emergency_call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button cops;
    EditText num;
    Button call;
    String n1;
    String tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cal = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01045769789"));
                startActivity(cal);
            }
        });

        cops = findViewById(R.id.police);
        cops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coop = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"));
                startActivity(coop);
            }
        });

        n1 = num.getText().toString();
        final String tel = "tel:" + n1;
        call = findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + n1));
                    startActivity(call);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                }
                //Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + n1));
                //startActivity(call);
                //startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
            }
        });


//        num = (EditText)findViewById(R.id.Num);
//        String n1 = num.getText().toString().trim();
//
//
//        call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent cal = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01045769789"));
//                startActivity(cal);
//
////                Toast.makeText(MainActivity.this, "Details Saved Successfully.", Toast.LENGTH_SHORT).show();
////                Intent cll = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: n1"));
////                startActivity(cll);
//            }
//        });
    }
}