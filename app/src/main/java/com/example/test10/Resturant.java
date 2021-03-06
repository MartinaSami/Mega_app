package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Resturant extends AppCompatActivity {

    CheckBox chkPizza, chkBurger, chkChicken, chkVegetables, chkPepsi, chkTea, chkCoffee, chkAnise;
    Button btnAskForInvoice;
    TextView txOrderAndInvoice;
    static float invoice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        //Casting
        chkPizza = findViewById(R.id.chk_pizza);
        chkBurger = findViewById(R.id.chk_burger);
        chkChicken = findViewById(R.id.chk_chicken);
        chkVegetables = findViewById(R.id.chk_vegetables);
        chkPepsi = findViewById(R.id.chk_Pepsi);
        chkCoffee = findViewById(R.id.chk_Coffee);
        chkTea = findViewById(R.id.chk_Tea);
        chkAnise = findViewById(R.id.chk_Anise);
        btnAskForInvoice = findViewById(R.id.btn_invoice);
        txOrderAndInvoice = findViewById(R.id.tx_invoice);

        btnAskForInvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                invoice = 0;

                StringBuilder totalOrder = new StringBuilder();

                if (chkPizza.isChecked()) {
                    invoice += 30; // Add unit price
                    totalOrder.append(chkPizza.getText().toString() + " , "); //Add unit name
                }
                if (chkBurger.isChecked()) {
                    invoice += 20;
                    totalOrder.append(chkBurger.getText().toString() + " , "); //Add unit name
                }
                if (chkChicken.isChecked()) {
                    invoice += 35;
                    totalOrder.append(chkChicken.getText().toString() + " , "); //Add unit name
                }
                if (chkVegetables.isChecked()) {
                    invoice += 5;
                    totalOrder.append(chkVegetables.getText().toString() + " , "); //Add unit name
                }
                if (chkPepsi.isChecked()) {
                    invoice += 5;
                    totalOrder.append(chkPepsi.getText().toString() + " , "); //Add unit name
                }
                if (chkTea.isChecked()) {
                    invoice += 3;
                    totalOrder.append(chkTea.getText().toString() + " , "); //Add unit name
                }
                if (chkCoffee.isChecked()) {
                    invoice += 12;
                    totalOrder.append(chkCoffee.getText().toString() + " , "); //Add unit name
                }
                if (chkAnise.isChecked()) {
                    invoice += 3.5;
                    totalOrder.append(chkBurger.getText().toString() + " , "); //Add unit name
                }

                txOrderAndInvoice.setText("Your order is : " + totalOrder + "and your invoice is :" + invoice + "$");


            }
        });
    }
}
