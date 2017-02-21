package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 * a sub class of user. takes in a name and a password
 */

public class Manager extends Worker {

    public Manager(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    public void viewWaterReport() {
        System.out.println("viewed water report");
    }
}
