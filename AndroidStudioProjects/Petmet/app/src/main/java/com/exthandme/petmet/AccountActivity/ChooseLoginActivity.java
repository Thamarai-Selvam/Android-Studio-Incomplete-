package com.exthandme.petmet.AccountActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.exthandme.petmet.HomeActivity;
import com.exthandme.petmet.R;
import com.google.firebase.auth.FirebaseAuth;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class ChooseLoginActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);

        //Check if user is already Logged in TODO: Check for malfunctioning...
        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(ChooseLoginActivity.this, HomeActivity.class));
            finish();
        }

        setContentView(R.layout.activity_choose_login);
        FloatingTextButton floatingTextButton = findViewById(R.id.loginemail);
        floatingTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailintent = new Intent(ChooseLoginActivity.this, LoginActivity.class);
                startActivity(emailintent);
            }
        });
        FloatingTextButton floatingTextButton2 = findViewById(R.id.loginphone);
        floatingTextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneintent = new Intent(ChooseLoginActivity.this, otpphone.class);
                startActivity(phoneintent);
            }
        });
    }
}
