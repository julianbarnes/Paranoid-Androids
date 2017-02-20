package com.example.olivia.myapplication.model;

/**
 * Created by Olivia on 2/12/2017.
 */

public class User {
    private String name;
    private String password;

    public User(String n, String p) {
        name = n;
        password = p;
    }

    public boolean checkPassword(String pass) {
        return password.equals(pass);
    }

}
