package com.example.olivia.myapplication.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.olivia.myapplication.model.User;
/**
 * Created by Olivia on 2/12/2017.
 */

public class DummyApp extends AppCompatActivity {

    private Button logoutButton;
    private Button profileButton;
    //private static User user;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                user = (User)getIntent().getSerializableExtra("user"); //Obtaining data
            }
            super.onCreate(savedInstanceState);
            setContentView(R.layout.dummy_app);
        } catch (Exception e) {
            System.out.println(e);
        }

        logoutButton = (Button) findViewById(R.id.logout_button);
        profileButton = (Button) findViewById(R.id.profile_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DummyApp.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DummyApp.this, Profile_Screen.class);
                intent.putExtra("user", user);
                //.putExtra
                startActivity(intent);

                finish();
            }
        });
    }

}
