package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class YatGroup extends AppCompatActivity {

    ListView lvYatGroup;
    String yatGroupNames[] = {"Ali", "Yehia", "Afnan", "Mahmoud", "Ahmed Abd el Nasser",
            "Ali", "Yehia", "Afnan", "Mahmoud", "Ahmed Abd el Nasser"};
    String yatGroupPosition[] = {"Android Developer", "Ios Developer", "PHP Developer", "Web Developer", "Designer",
            " Android Developer", "Ios Developer", "PHP Developer", "Web Developer", "Designer",};
    Integer[] imgid={
            R.drawable.dog,R.drawable.logo,
            R.drawable.tempreature,R.drawable.dog,
            R.drawable.logo,
            R.drawable.dog,R.drawable.logo,
            R.drawable.tempreature,R.drawable.dog,R.drawable.dog,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yat_group);
        lvYatGroup = findViewById(R.id.lvYatGroup);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, yatGroupNames);
//
//        lvYatGroup.setAdapter(adapter);

        MyListViewAdapter adapter=new MyListViewAdapter(this, yatGroupNames, yatGroupPosition,imgid);
        lvYatGroup.setAdapter(adapter);
        lvYatGroup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = String.valueOf(adapter.getItem(position));
                Toast.makeText(YatGroup.this, name, Toast.LENGTH_SHORT).show();
            }

        });

        }
    }