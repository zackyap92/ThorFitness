package com.apps.zackyap.pdma;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText editTextUsername = (EditText) findViewById(R.id.textViewUsername);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this, User.class);
                startActivity(intent);

                String username = editTextUsername.getText().toString();

        //Write to SharedPreferences
        SharedPreferences sharedPref = getSharedPreferences("ptdipwt5", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("username", username);
        editor.commit();
        finish();

            }
        });
    }
}