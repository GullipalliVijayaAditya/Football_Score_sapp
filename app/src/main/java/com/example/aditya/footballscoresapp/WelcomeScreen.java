package com.example.aditya.footballscoresapp;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {
    private static int welcome_screen_time_out = 4000;
    LinearLayout l1,l2;
    Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        l1 = (LinearLayout) findViewById(R.id.top_animation);
        l2 = (LinearLayout) findViewById(R.id.down_animation);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent homeIntent = new Intent(WelcomeScreen.this, MainActivity.class);
            startActivity(homeIntent);
            finish();
            }


        },welcome_screen_time_out);

        }


    }


