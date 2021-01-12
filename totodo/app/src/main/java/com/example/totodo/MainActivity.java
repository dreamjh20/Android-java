package com.example.totodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    ListView listView;
    String data;

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.txt);
        button = (Button)findViewById(R.id.addbtn);
        listView = (ListView)findViewById(R.id.listview);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = editText.getText().toString();

                if(data.equals("")){
                    Toast.makeText(MainActivity.this, "뭐라도 입력하세요", Toast.LENGTH_LONG).show();
                }
                else {
                    arrayList.add(data);
                    adapter.notifyDataSetChanged();
                }
                editText.setText("");
            }
        });
    }
}