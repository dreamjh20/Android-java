package com.example.updownfunk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static java.lang.String.valueOf;
public class MainActivity extends AppCompatActivity {
    EditText V_num;
    Button Plus_btn;
    Button Minus_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        V_num = findViewById(R.id.V_num);
        Plus_btn = findViewById(R.id.Plus_btn);
        Minus_btn = findViewById(R.id.Minus_btn);
        Plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(V_num.getText().toString())+1;
                V_num.setText(Integer.toString(a));
            }
        });
        Minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(V_num.getText().toString())-1;
                V_num.setText(Integer.toString(a));
            }
        });
    }
}