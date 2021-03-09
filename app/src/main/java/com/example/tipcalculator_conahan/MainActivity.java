package com.example.tipcalculator_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText subtotal_field;
    EditText size_field;
    RadioButton no_tip;
    RadioButton fifteen;
    RadioButton twenty;
    RadioButton twenty_five;
    RadioButton custom;
    EditText custom_field;
    Button calculate;

    float subtotal;
    int size;
    float tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subtotal_field = findViewById(R.id.subtotal_field);
        size_field = findViewById(R.id.size_field);
        no_tip = findViewById(R.id.no_tip);
        fifteen = findViewById(R.id.fifteen);
        twenty = findViewById(R.id.twenty);
        twenty_five = findViewById(R.id.twenty_five);
        custom = findViewById(R.id.custom);
        custom_field = findViewById(R.id.custom_field);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}