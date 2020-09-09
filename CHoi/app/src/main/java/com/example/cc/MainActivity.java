package com.example.cc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Person;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<SNS>  arrayList = new ArrayList<>();
        arrayList.add(new SNS(R.drawable.facebook, "Facebook"/*, "문준혁"*/));
        arrayList.add(new SNS(R.drawable.instagram, "Instagram"/*, "Moonvely_i"*/));
        arrayList.add(new SNS(R.drawable.github, "Github"/*, "dreamjh20"*/));

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);
    }
}