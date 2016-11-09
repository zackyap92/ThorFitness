package com.apps.zackyap.pdma;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.view.ViewPager;


public class workout extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        AlertDialog alertDialog = new AlertDialog.Builder(workout.this).create();
        alertDialog.setTitle("Instructions");
        alertDialog.setMessage("\nPress START for musics \n" +
                "\nSlide left for next exercises \n");

        alertDialog.setButton("Continue", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.show();

        Button button1=(Button)findViewById(R.id.button1);
        final Button button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player= MediaPlayer.create(workout.this,R.raw.tabata);
                player.start();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player.isPlaying()) {
                    player.pause();
                    button2.setText("Resume");
                } else {
                    player.start();
                    button2.setText("Pause");
                }
            }

        });
    }
}
