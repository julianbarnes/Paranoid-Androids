package com.example.olivia.myapplication.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.olivia.myapplication.model.User;
import com.example.olivia.myapplication.model.UserManager;
//import com.example.olivia.myapplication.model.User;
//import com.example.olivia.myapplication.model.UserManager;

//import static com.example.olivia.myapplication.model.UserManager.*;

/**
 * A register page that lets new users register for a new account with a username and a password
 * Cancel button will take you bacck to the welcome page.
 *
 *
 */
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final UserManager manager = new UserManager();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etId = (EditText) findViewById(R.id.etId);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etAddress = (EditText) findViewById(R.id.etAddress);

        final Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String id = etId.getText().toString();
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                final String email = etEmail.getText().toString();
                final String address = etAddress.getText().toString();
                User newUser = new User(id, username, password, email, address);
                manager.addUser(id, username, password, email, address);
                startActivity(new Intent(getApplicationContext(), WelcomeScreen.class));
            }
        });

        final Button cancelButton = (Button) findViewById(R.id.cancelButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
            }
        });
    }
}
