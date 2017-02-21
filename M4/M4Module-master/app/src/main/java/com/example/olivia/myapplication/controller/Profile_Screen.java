package com.example.olivia.myapplication.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.olivia.myapplication.model.User;
import com.example.olivia.myapplication.model.UserManager;

/**
 * Created by Rayna on 2/19/17
 */

public class Profile_Screen extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText homeAddress;
    private EditText password;
    private static User user;
    private Button cancelButton;
    private UserManager manager = new UserManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        try {
            super.onCreate(savedInstanceState);
            {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    User user2 = (User) getIntent().getSerializableExtra("user"); //Obtaining data
                    if (user2 != null) {
                        user = user2;
                    }
                }
            }

            setContentView(R.layout.activity_profile__screen);
            name = (EditText) findViewById(R.id.name);
            name.setText(user.nameGetter(), TextView.BufferType.EDITABLE);

            email = (EditText) findViewById(R.id.EmailAddress);
            email.setText(user.getEmail(), TextView.BufferType.EDITABLE);

            homeAddress = (EditText) findViewById(R.id.HomeAddress);
            homeAddress.setText(user.getAddress(), TextView.BufferType.EDITABLE);

            password = (EditText) findViewById(R.id.password);
            password.setText(user.PasswordGetter(), TextView.BufferType.EDITABLE);

            cancelButton = (Button) findViewById(R.id.Cancel);
            cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(), DummyApp.class));
                    finish();
                }
            });

            final Button editButton = (Button) findViewById(R.id.edit);
            editButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String username = name.getText().toString();
                    final String userpassword = password.getText().toString();
                    final String useremail = email.getText().toString();
                    final String useraddress = homeAddress.getText().toString();
                    manager.deleteUser(user.getId());
                    user = new User(user.getId(), username, userpassword, useremail, useraddress, user.getUserType());
                    manager.addUser(user.getId(), username, userpassword, useremail, useraddress, user.getUserType());
                    startActivity(new Intent(getApplicationContext(), DummyApp.class));
                    finish();
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}