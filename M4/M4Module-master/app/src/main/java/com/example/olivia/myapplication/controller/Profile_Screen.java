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

/**
 * Created by Rayna on 2/19/17
 */

public class Profile_Screen extends AppCompatActivity {
    private EditText name;
    private User user;
//    public void readFile() throws IOException, ClassNotFoundException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("User.bin"));
//        user = (User) objectInputStream.readObject();
//        System.out.println(user.nameGetter());
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                user = (User)getIntent().getSerializableExtra("user"); //Obtaining data
            }

            setContentView(R.layout.activity_profile__screen);
//        try {
//            readFile();
//            System.out.println("here");
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
            System.out.println("ok");
            name = (EditText) findViewById(R.id.editText2);
            name.setText(user.nameGetter(), TextView.BufferType.EDITABLE);
        } catch (Exception e) {
            System.out.println("e");
        }


    }

}
