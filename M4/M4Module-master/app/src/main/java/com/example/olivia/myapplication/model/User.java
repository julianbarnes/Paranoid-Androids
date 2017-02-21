package com.example.olivia.myapplication.model;

import java.io.Serializable;

/**
 * Created by Olivia on 2/12/2017.
 */

public class User implements Serializable{
    private String id;
    private String name;
    private String password;
    private String email;
    private String address;

    public User(String i, String n, String p, String e, String a) {
        id = i;
        name = n;
        password = p;
        email = e;
        address = a;
    }

    public String getId() {
        return id;
    }
    public String nameGetter() {
        return name;
    } // Added by Rayna

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void nameChanger(String newName) {
        name = newName;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public boolean checkPassword(String pass) {
        return password.equals(pass);
    }

}
