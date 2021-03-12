package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tempretaure extends AppCompatActivity implements View.OnClickListener {


    EditText etFahrenheit, etCelsius;
    Button btnConvert, btnResetValues;
    String etFahrenheitString, etCelsiusString;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempretaure);
        etFahrenheit = findViewById(R.id.etFahrenheit);
        etCelsius = findViewById(R.id.etCelsius);
        btnConvert = findViewById(R.id.btnConvert);
        btnResetValues = findViewById(R.id.btn_resetTemperatureValues);
        btnConvert.setOnClickListener(this);
        btnResetValues.setOnClickListener(this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnConvert:
                etFahrenheitString = etFahrenheit.getText().toString().trim();
                etCelsiusString = etCelsius.getText().toString().trim();

                if (!etFahrenheitString.isEmpty() && etCelsiusString.isEmpty()) {
                    //Converting from fahrenheit to celsius
                    double convertedValue = Double.parseDouble(etFahrenheitString);
                    String result = String.valueOf((convertedValue - 32) / 1.8);
                    etCelsius.setText(result);
                } else if (etFahrenheitString.isEmpty() && !etCelsiusString.isEmpty()) {
                    //Converting from celsius to Fahrenheit
                    double convertedValue = Double.parseDouble(etCelsiusString);
                    String result = String.valueOf((convertedValue * 1.8) + 32);
                    etFahrenheit.setText(result);

                } else if (!etFahrenheitString.isEmpty() && !etCelsiusString.isEmpty()) {
                    Toast.makeText(this, "Please click on reset values", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Please enter values", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_resetTemperatureValues:

                if (etFahrenheitString.isEmpty() && etCelsiusString.isEmpty()) {
                    Toast.makeText(getBaseContext(), "There is no data to reset", Toast.LENGTH_SHORT).show();
                } else {
                    etFahrenheit.setText("");
                    etCelsius.setText("");
                }
                break;

        }
    }
}
