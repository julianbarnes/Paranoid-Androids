package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 *  a sub class of user. takes in a name and a password
 */

public class Admin extends User {

    public Admin(String id, String name, String password, String email, String address) {
        super(id, name, password, email, address);
    }
}
