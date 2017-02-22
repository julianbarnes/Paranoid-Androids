package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 * a sub class of Worker class. takes in a name and a password. A manger can do everything that
 * a worker can do. Managers also have a viewWaterReport method that lets them view past water
 * report for analysis
 */

public class Manager extends Worker {

    public Manager(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    /**
     * a method that lets Managers view past water reports for analysis
     */
    public void viewWaterReport() {
        System.out.println("viewed water report");
    }
}
