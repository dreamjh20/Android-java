package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_clear, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight, btn_nine, btn_plus, btn_minus, btn_multiply, btn_division, btn_equal, btn_zezero, btn_reamin, btn_backspace;
    TextView txt_result;
    String result;

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
        btn_zezero = findViewById(R.id.zerozero);
        btn_reamin = findViewById(R.id.remain);
        btn_backspace = findViewById(R.id.backspace);
    }

    public void buttonClick(View view) {
        if (view.getId() == R.id.clear){
            result = " ";
            txt_result.setText(result);
        }


        if (view.getId() == R.id.one){
            result = txt_result.getText().toString();
            result += "1";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.two){
            result = txt_result.getText().toString();
            result += "2";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.three){
            result = txt_result.getText().toString();
            result += "3";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.four){
            result = txt_result.getText().toString();
            result += "4";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.five){
            result = txt_result.getText().toString();
            result += "5";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.six){
            result = txt_result.getText().toString();
            result += "6";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.seven){
            result = txt_result.getText().toString();
            result += "7";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.eight){
            result = txt_result.getText().toString();
            result += "8";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.nine){
            result = txt_result.getText().toString();
            result += "9";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.zero){
            result = txt_result.getText().toString();
            result += "0";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.zerozero){
            result = txt_result.getText().toString();
            result += "00";
            txt_result.setText(result);
        }

        if (view.getId() == R.id.plus){
            result = txt_result.getText().toString();
            result += "+";
            txt_result.setText(result);
        }
        else if(view.getId() == R.id.minus){
            result = txt_result.getText().toString();
            result += "-";
            txt_result.setText(result);
        }
        else if(view.getId() == R.id.multiply){
            result = txt_result.getText().toString();
            result += "×";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.division){
            result = txt_result.getText().toString();
            result += "÷";
            txt_result.setText(result);
        }
        else if (view.getId() == R.id.remain){
            result = txt_result.getText().toString();
            result += "%";
            txt_result.setText(result);
        }

        if (view.getId() == R.id.equal){
            result = txt_result.getText().toString();
            result += "=";
            txt_result.setText(result);
        }

        if (view.getId() == R.id.backspace){
            result = txt_result.getText().toString();

            result = result/ 10;
        }
    }
}