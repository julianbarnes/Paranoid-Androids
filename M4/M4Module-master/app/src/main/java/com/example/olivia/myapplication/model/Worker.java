package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 *  a sub class of user. Can do everything that a user can do plus an added method
 *  ReportWaterPurity that that lets Workers view water purity
 *
 */

public class Worker extends User {

    public Worker(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    public void ReportWaterPurity() {
        System.out.println("Report water purity");
    }
}
