package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// forget password and recover

public class MainActivity3 extends AppCompatActivity {

        Button btn_resetPassword;
        EditText et_RecoveryMail;
        String recoveryMail;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);
            btn_resetPassword = findViewById(R.id.btn_resetPassword);
            et_RecoveryMail = findViewById(R.id.et_recoveryMail);

            btn_resetPassword.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recoveryMail = et_RecoveryMail.getText().toString().trim();  //Getting string value from the edit text

                    //checking if the value is empty
                    if (recoveryMail.isEmpty()) {
                        Toast.makeText(MainActivity3.this, "Please enter your recovery Mail", Toast.LENGTH_SHORT).show();
                    }
                    //Sending the resetting link to the recovery mail
                    else {
                        Toast.makeText(MainActivity3.this, " Done => Please check " + recoveryMail, Toast.LENGTH_LONG).show();

                    }
                }
            });

        }
    }