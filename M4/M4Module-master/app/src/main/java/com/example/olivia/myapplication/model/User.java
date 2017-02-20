package com.example.olivia.myapplication.model;

import java.io.Serializable;

/**
 * Created by Olivia on 2/12/2017.
 */

public class User implements Serializable{
    private String name;
    private String password;

    public User(String n, String p) {
        name = n;
        password = p;
    }
    public String nameGetter() {
        return name;
    } // Added by Rayna
    public void nameChanger(String newName) {
        name = newName;
    }



    public boolean checkPassword(String pass) {
        return password.equals(pass);
    }

}
