package com.apps.zackyap.pdma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class bmical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmical);

        final EditText editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        final EditText editTextWeight = (EditText) findViewById(R.id.editTextWeight);

        Button buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double weight = Double.parseDouble(editTextWeight.getText().toString());
                double bmi = weight / (height * height);

                TextView textViewBMI = (TextView) findViewById(R.id.textViewBMI);
                DecimalFormat df = new DecimalFormat("#.00");
                textViewBMI.setText(df.format(bmi));

                TextView textViewCategory = (TextView) findViewById(R.id.textViewCategory);
                String category;
                if (bmi > 30) {
                    category = "Obese";
                } else if (bmi >= 25) {
                    category = "Overweight";
                } else if (bmi >= 18.5) {
                    category = "Normal";
                } else {
                    category = "Underweight";
                }
                textViewCategory.setText(category);

            }
        });
    }
}
