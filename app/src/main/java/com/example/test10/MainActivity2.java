package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

// Registration

public class MainActivity2 extends AppCompatActivity {

    TextView login;
    Button register;
    private Toast mToastToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login = findViewById(R.id.tv_login);
        register = findViewById(R.id.btn_register);

        login.setPaintFlags(login.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        Objects.requireNonNull(getSupportActionBar()).hide(); //hiding the toolbar

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Going to Login Activity
                Intent goToLogin = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(goToLogin);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity2.this, "Registration Successfully", Toast.LENGTH_LONG).show();
                Intent goToLogin = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(goToLogin);
                finish();
            }
        });

    }

}