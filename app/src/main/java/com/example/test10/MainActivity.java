package com.example.test10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    TextView tv_forgetPassword, tv_registerNow;
    Button btn_login;
    AlertDialog.Builder buildAlertDialog;
    EditText etUserName, etPassword;
    CheckBox chkRememberMe;


    boolean clickTwiceToExit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkRememberMe = findViewById(R.id.chkRememberMe);
        buildAlertDialog = new AlertDialog.Builder(this);

        tv_forgetPassword = findViewById(R.id.tv_forgetPassword);
        tv_registerNow = findViewById(R.id.tv_registerNow);
        btn_login = findViewById(R.id.btn_login);
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);

        tv_forgetPassword.setPaintFlags(tv_forgetPassword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv_registerNow.setPaintFlags(tv_registerNow.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Objects.requireNonNull(getSupportActionBar()).hide(); //hiding the toolbar

        tv_registerNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Going to Registration Activity main activity 2
                Intent MainActivity2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(MainActivity2);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to our Mega APP", Toast.LENGTH_SHORT).show();
                Intent goToHomeActivity = new Intent(getApplicationContext(), Home.class);
                startActivity(goToHomeActivity);
            }
        });

        tv_forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Going to Forget Password Activity
                Intent goToMainActivity3 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(goToMainActivity3);
            }
        });


        SharedPreferences rememberMeFile = getSharedPreferences("rememberMeFile", 0);
        if (rememberMeFile.getBoolean("bool", true)) {
            String emailAddress = rememberMeFile.getString("username", "");
            etUserName.setText(emailAddress);

            String password = rememberMeFile.getString("password", "");
            etPassword.setText(password);
            chkRememberMe.setChecked(true);
        }
    }

    @Override
    public void onBackPressed() {

        buildAlertDialog.setMessage("Do you want to exit ?!")
                .setIcon(R.drawable.logo)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish(); // close the application
                        Toast.makeText(MainActivity.this, "See you later", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel(); //close the dialog interface
                Toast.makeText(MainActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog alertDialog = buildAlertDialog.create();
        alertDialog.setTitle("Exit");
        alertDialog.show();


//        super.onBackPressed();
    }

    public void rememberMe(View view) {

        //Creating the xml SharedPreferences File
        SharedPreferences rememberMeFile = getSharedPreferences("rememberMeFile", 0);
        //Creating the pen to edit inside the rememberMe file
        SharedPreferences.Editor pen = rememberMeFile.edit();

        //Adding String values to the rememberMefile
        pen.putString("username", etUserName.getText().toString().trim());
        pen.putString("password", etPassword.getText().toString().trim());
        pen.putBoolean("bool", true);
        pen.apply();

        if (chkRememberMe.isChecked()) {
            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        }
    }

}


//    @Override
//    public void onBackPressed() {
//        if (clickTwiceToExit){  //check if the value is true
//            super.onBackPressed(); // close the app
//        }
//        else {
//            this.clickTwiceToExit = true;  // set the value for true
//
//            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
//
//            // if the user waited more than 3 seconds , set the value false
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    clickTwiceToExit = false;
//                }
//            },3000);
//        }
//        //show toast to let the user click again quickly
//    }


