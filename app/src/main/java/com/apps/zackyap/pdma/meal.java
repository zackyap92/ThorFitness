package com.apps.zackyap.pdma;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.apps.zackyap.pdma.R.id.activity_meal;

public class meal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        Toast.makeText(meal.this, "Press image to view my meal plans!!!",
                Toast.LENGTH_LONG).show();

        Button buttonBreakfast = (Button) findViewById(R.id.buttonBreakfast);
        buttonBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(meal.this).create();
                alertDialog.setTitle("Breakfast");
                alertDialog.setMessage("Chicken Salad \n" +
                        "\nCalories: 417 kcal \n" +
                        "Carbs: 2.5 g \n" +
                        "Fats: 31.5 g \n" +
                        "Proteins: 29.4 g \n" );

                alertDialog.setButton("Continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.show();
            }
        });

        Button buttonLunch = (Button) findViewById(R.id.buttonLunch);
        buttonLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(meal.this).create();
                alertDialog.setTitle("Lunch");
                alertDialog.setMessage("Grilled Chicken and Cheese Sandwich \n" +
                        "\nCalories: 670 kcal \n" +
                        "Carbs: 66.7 g \n" +
                        "Fats: 25.2 g \n" +
                        "Proteins: 45.1 g \n" );

                alertDialog.setButton("Continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.show();
            }
        });

        Button buttonDinner = (Button) findViewById(R.id.buttonDinner);
        buttonDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(meal.this).create();
                alertDialog.setTitle("Dinner");
                alertDialog.setMessage("Chili-Glazed Pork With Sweet Potato Hash \n" +
                        "\nCalories: 366 kcal \n" +
                        "Carbs: 33.8 g \n" +
                        "Fats: 10.5 g \n" +
                        "Proteins: 35.3 g \n" );

                alertDialog.setButton("Continue", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog.show();
            }
        });
    }
}



