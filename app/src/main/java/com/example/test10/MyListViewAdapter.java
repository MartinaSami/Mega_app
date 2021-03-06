package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListViewAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListViewAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid) {
        super(context, R.layout.activity_list_view_item, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_list_view_item, null,true);

        TextView titleText =  rowView.findViewById(R.id.txFullName);
        ImageView imageView =  rowView.findViewById(R.id.ivProfilePicture);
        TextView subtitleText =  rowView.findViewById(R.id.txPersonPosition);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

    };
}
