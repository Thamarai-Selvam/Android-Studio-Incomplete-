package com.exthandme.petmet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.exthandme.petmet.AccountActivity.ChooseLoginActivity;
import com.exthandme.petmet.AccountActivity.LoginActivity;

public class splash extends AppCompatActivity {
    public static  int SPLASH_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(splash.this, ChooseLoginActivity.class));
                finish();
            }
        },SPLASH_TIME);
    }
}
