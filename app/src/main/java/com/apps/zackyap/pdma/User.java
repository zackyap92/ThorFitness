package com.apps.zackyap.pdma;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView textViewUsername = (TextView) findViewById(R.id.textViewUsername);

        SharedPreferences sharedPref = getSharedPreferences("ptdipwt5", Context.MODE_PRIVATE);
        String username = sharedPref.getString("username", "undefined");
        textViewUsername.setText(username);

        Button buttonWorkout = (Button) findViewById(R.id.buttonWorkout);
        buttonWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User.this, workout.class);
                startActivity(intent);
            }
        });

        Button buttonMeal = (Button) findViewById(R.id.buttonMeal);
        buttonMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User.this, meal.class);
                startActivity(intent);
            }
        });

        Button buttonBMI = (Button) findViewById(R.id.buttonBMI);
        buttonBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(User.this, bmical.class);
                startActivity(intent);
            }
        });

    }
}