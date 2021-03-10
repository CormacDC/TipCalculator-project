package com.example.tipcalculator_conahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText subtotal_field;
    private EditText size_field;
    private EditText custom_field;
    private Button calculate;

    private double subtotal;
    private int size;
    private double tip;
    private double tipPercent;
    private boolean customTip;

    private double total;
    private double totalPerPerson;

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subtotal_field = findViewById(R.id.subtotal_field);
        size_field = findViewById(R.id.size_field);
        custom_field = findViewById(R.id.custom_field);
        calculate = findViewById(R.id.calculate);

        i = new Intent(this, MainActivity2.class);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtotal = Double.parseDouble(subtotal_field.getText().toString());
                size = Integer.parseInt(size_field.getText().toString());
                if(customTip)
                    tip = Double.parseDouble(custom_field.getText().toString());
                else
                    tip = tipPercent * subtotal;

                total = subtotal + tip;
                totalPerPerson = total / size;


                startActivity(i);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.no_tip:
                if (checked)
                    tipPercent = 0.00;
                    break;
            case R.id.fifteen:
                if (checked)
                    tipPercent = 0.15;
                    break;
            case R.id.twenty:
                if (checked)
                    tipPercent = 0.20;
                    break;
            case R.id.twenty_five:
                if (checked)
                    tipPercent = 0.25;
                    break;
            case R.id.custom:
                if (checked)
                    customTip = true;
                    break;
        }
    }

}