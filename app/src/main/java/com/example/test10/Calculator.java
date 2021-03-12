package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Calculator extends AppCompatActivity implements View.OnClickListener {


    ImageView ivHome;
    EditText etFirstNumber, etSecondNumber;
    Button btnAddition, btnSubtraction, btnMultiplication, btnDivision, btnResetValues;
    TextView tvResult;
    String stringValueOfNumberOne, stringValueOfNumberTwo, operation;
    double doubleValueOfNumberOne, doubleValueOfNumberTwo;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calculator);
            Objects.requireNonNull(getSupportActionBar()).hide();  //Hiding the Action bar

            //Casting IDs
            ivHome = findViewById(R.id.iv_home);
            etFirstNumber = findViewById(R.id.et_firstNumber);
            etSecondNumber = findViewById(R.id.et_secondNumber);
            btnAddition = findViewById(R.id.btn_Addition);
            btnSubtraction = findViewById(R.id.btn_subtraction);
            btnMultiplication = findViewById(R.id.btn_multiplication);
            btnDivision = findViewById(R.id.btn_division);
            btnResetValues = findViewById(R.id.btn_resetValues);
            tvResult = findViewById(R.id.tv_result);

            //Casting clickListeners
            btnAddition.setOnClickListener(this);
            btnSubtraction.setOnClickListener(this);
            btnMultiplication.setOnClickListener(this);
            btnDivision.setOnClickListener(this);
            btnResetValues.setOnClickListener(this);
            ivHome.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            //Get the value from the two edit text
            stringValueOfNumberOne = etFirstNumber.getText().toString();
            stringValueOfNumberTwo = etSecondNumber.getText().toString();

            if (stringValueOfNumberOne.isEmpty() || stringValueOfNumberTwo.isEmpty()) {
                Toast.makeText(this, "Please enter the values required", Toast.LENGTH_SHORT).show();
                resetValues();
            }
            else {
                doubleValueOfNumberOne = Double.parseDouble(stringValueOfNumberOne);
                doubleValueOfNumberTwo = Double.parseDouble(stringValueOfNumberTwo);
                switch (v.getId()) {

                    case R.id.btn_Addition:

                        operation = String.valueOf(doubleValueOfNumberOne + doubleValueOfNumberTwo);
                        tvResult.setText("The Result is : " + operation);
                        break;

                    case R.id.btn_subtraction:
//                stringValueOfNumberOne = etFirstNumber.getText().toString();
//                stringValueOfNumberTwo = etSecondNumber.getText().toString();
//                doubleValueOfNumberOne = Double.parseDouble(stringValueOfNumberOne);
//                doubleValueOfNumberTwo = Double.parseDouble(stringValueOfNumberTwo);
                        operation = String.valueOf(doubleValueOfNumberOne - doubleValueOfNumberTwo);
                        tvResult.setText("The Result is : " + operation);
                        break;
                    case R.id.btn_multiplication:
//                stringValueOfNumberOne = etFirstNumber.getText().toString();
//                stringValueOfNumberTwo = etSecondNumber.getText().toString();
//                doubleValueOfNumberOne = Double.parseDouble(stringValueOfNumberOne);
//                doubleValueOfNumberTwo = Double.parseDouble(stringValueOfNumberTwo);
                        operation = String.valueOf(doubleValueOfNumberOne * doubleValueOfNumberTwo);
                        tvResult.setText("The Result is : " + operation);
                        break;
                    case R.id.btn_division:
//                stringValueOfNumberOne = etFirstNumber.getText().toString();
//                stringValueOfNumberTwo = etSecondNumber.getText().toString();
//                doubleValueOfNumberOne = Double.parseDouble(stringValueOfNumberOne);
//                doubleValueOfNumberTwo = Double.parseDouble(stringValueOfNumberTwo);
                        operation = String.valueOf(doubleValueOfNumberOne / doubleValueOfNumberTwo);
                        tvResult.setText("The Result is : " + operation);
                        break;

                    case R.id.btn_resetValues:

                        resetValues();
                        break;

                    case R.id.iv_home:
                        Toast.makeText(this, "Going Home", Toast.LENGTH_SHORT).show();
                        Intent goToHomeActivity = new Intent(getApplicationContext(), Home.class);
                        startActivity(goToHomeActivity);
                        break;
                }
            }
        }

        public void resetValues(){
            etFirstNumber.setText("");
            etSecondNumber.setText("");
            tvResult.setText("Result is : ");
        }
    }


