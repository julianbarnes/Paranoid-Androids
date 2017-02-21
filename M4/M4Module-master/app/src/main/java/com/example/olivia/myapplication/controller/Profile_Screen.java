package com.example.olivia.myapplication.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.example.olivia.myapplication.model.User;
import com.example.olivia.myapplication.model.UserManager;

/**
 * Created by Rayna on 2/19/17
 */

public class Profile_Screen extends AppCompatActivity {
    private EditText name;
    private User user;
    private Button editButton;


//    public void readFile() throws IOException, ClassNotFoundException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("User.bin"));
//        user = (User) objectInputStream.readObject();
//        System.out.println(user.nameGetter());
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final UserManager manager = new UserManager();
        try {
            super.onCreate(savedInstanceState);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                user = (User)getIntent().getSerializableExtra("user"); //Obtaining data
            }

            setContentView(R.layout.activity_profile__screen);
            name = (EditText) findViewById(R.id.editText2);
            name.setText(user.nameGetter(), TextView.BufferType.EDITABLE);

            editButton = (Button) findViewById(R.id.profile_button);
            editButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    name = (EditText) findViewById(R.id.editText2);
                    manager.editUser(user.nameGetter(),name.toString());
                    startActivity(new Intent(getApplicationContext(), WelcomeScreen.class));}
                  //  manager.deditUser("user","rayna"); }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        editButton = (Button) findViewById(R.id.profile_button);
//        editButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                name = (EditText) findViewById(R.id.editText2);
//                manager.editUser(user.nameGetter(),name.toString()); }
//        });
    }
}