package com.example.tipcalculator_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView subtotal;
    private TextView size;
    private TextView tip;
    private TextView tipPercent;
    private TextView total;
    private TextView totalPerPerson;

    private double subtotalVal;
    private double sizeVal;
    private double tipVal;
    private double tipPercentVal;
    private double totalVal;
    private double totalPerPersonVal;

    private Button back;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();

        subtotalVal = i.getExtras().getDouble("subtotal");
        sizeVal = i.getExtras().getDouble("size");
        tipVal = i.getExtras().getDouble("tip");
        tipPercentVal = i.getExtras().getDouble("tipPercent");
        totalVal = i.getExtras().getDouble("total");
        totalPerPersonVal = i.getExtras().getDouble("totalPerPerson");

        subtotal = findViewById(R.id.subtotal);
        size = findViewById(R.id.size);
        tip = findViewById(R.id.tip);
        tipPercent = findViewById(R.id.tipPercent);
        total = findViewById(R.id.total);
        totalPerPerson = findViewById(R.id.totalPerPerson);

        subtotal.setText(subtotal.getText().toString() + subtotalVal);
        size.setText(size.getText().toString() + sizeVal);
        tip.setText(tip.getText().toString() + tipVal);
        tipPercent.setText(tipPercent.getText().toString() + tipPercentVal);
        total.setText(total.getText().toString() + totalVal);
        totalPerPerson.setText(totalPerPerson.getText().toString() + totalPerPersonVal);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}