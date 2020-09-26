package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_clear, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight, btn_nine, btn_plus, btn_minus, btn_multiply, btn_division, btn_equal;
    TextView txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_result = findViewById(R.id.result);
        btn_one = findViewById(R.id.one);
        btn_two = findViewById(R.id.two);
        btn_three = findViewById(R.id.three);
        btn_four = findViewById(R.id.four);
        btn_five = findViewById(R.id.five);
        btn_six = findViewById(R.id.six);
        btn_seven = findViewById(R.id.seven);
        btn_eight = findViewById(R.id.eight);
        btn_nine = findViewById(R.id.nine);
        btn_plus = findViewById(R.id.plus);
        btn_minus = findViewById(R.id.minus);
        btn_multiply = findViewById(R.id.multiply);
        btn_division = findViewById(R.id.division);
        btn_equal = findViewById(R.id.equal);
        btn_clear = findViewById(R.id.clear);
    }

    public void buttonClick(View view) {
        if (view.getId() == R.id.clear){
            txt_result.setText(" ");
        }


        if (view.getId() == R.id.one){
            txt_result.setText("1");
        }
        else if (view.getId() == R.id.two){
            txt_result.setText("2");
        }
        else if (view.getId() == R.id.three){
            txt_result.setText("3");
        }
        else if (view.getId() == R.id.four){
            txt_result.setText("4");
        }
        else if (view.getId() == R.id.five){
            txt_result.setText("5");
        }
        else if (view.getId() == R.id.six){
            txt_result.setText("6");
        }
        else if (view.getId() == R.id.seven){
            txt_result.setText("7");
        }
        else if (view.getId() == R.id.eight){
            txt_result.setText("8");
        }
        else if (view.getId() == R.id.nine){
            txt_result.setText("9");
        }
        else if (view.getId() == R.id.zero){
            txt_result.setText("0");
        }

    }
}