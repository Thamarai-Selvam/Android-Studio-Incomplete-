package com.exthandme.petmet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.exthandme.petmet.AccountActivity.ChooseLoginActivity;
import com.exthandme.petmet.AccountActivity.MyprofileActivity;
import com.google.firebase.auth.FirebaseAuth;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        FloatingTextButton floatingTextButton = findViewById(R.id.action_button);
        floatingTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rollerintent = new Intent(HomeActivity.this, FindmeActivity.class);
                startActivity(rollerintent);
            }
        });
        FloatingTextButton floatingTextButton2 = findViewById(R.id.profileb);
        floatingTextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileintent = new Intent(HomeActivity.this, MyprofileActivity.class);
                startActivity(profileintent);
            }
        });
    }
}
