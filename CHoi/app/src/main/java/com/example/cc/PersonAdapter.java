package com.example.cc;

import android.app.Person;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<SNS> {

    private Context mContext;
    private int mResource;

    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<SNS> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.image);

        TextView txtName = convertView.findViewById(R.id.textName);

        //TextView txtIdd = convertView.findViewById(R.id.textIdd);

        //TextView txtDes = convertView.findViewById(R.id.textDes);

        imageView.setImageResource(getItem(position).getImage());

        txtName.setText(getItem(position).getName());

        //txtIdd.setText(getItem(position).getIdd());


        //txtName.setText(getItem(position).getDes());

        return convertView;
    }
}
