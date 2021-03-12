package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class Splash extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            Objects.requireNonNull(getSupportActionBar()).hide(); //Hiding the toolbar

            //Creating new thread for sleep
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(800);  //Sleeping for 3 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //Going to Main Activity
                    Intent goToMainActivity = new Intent(Splash.this, MainActivity.class);
                    startActivity(goToMainActivity);
                    finish();
                }
            }).start();

        }
    }