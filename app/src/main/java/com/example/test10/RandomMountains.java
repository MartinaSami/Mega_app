package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


public class RandomMountains extends AppCompatActivity implements View.OnClickListener {

    ImageView ivHome;
    TextView tvRandomMountains;
    Button btnGenerateRandomHighestMountains;
    int Index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_mountains);
        ivHome = findViewById(R.id.iv_home);
        tvRandomMountains = findViewById(R.id.tv_randomMountains);
        btnGenerateRandomHighestMountains = findViewById(R.id.btn_generateRandomHighestMountains);
        ivHome.setOnClickListener(this);
        btnGenerateRandomHighestMountains.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_home:
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
                finish(); //finishing the Activity
                break;

            case R.id.btn_generateRandomHighestMountains:

                //Create Array of String
                String mountains[] = {"Everest", "Colorado", "Mousa", "Nibal", "Saint Catrine",
                        "Himalaya", "Gapl Tarek", "El Mo2atamm", "Safaga"};

                //Initialize Random Object
                Random randomMountains = new Random();

                //Pick up random index of the mountains length
                Index = randomMountains.nextInt(mountains.length);

                //Show the random mountains
                tvRandomMountains.setText(mountains[Index]);
                break;


        }

    }
}
