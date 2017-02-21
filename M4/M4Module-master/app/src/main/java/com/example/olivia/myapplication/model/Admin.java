package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 *  a sub class of user. takes in a name and a password
 */

public class Admin extends Manager {

    public Admin(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    public void deleteAccount() {
        System.out.println("delete account");
    }

    public void banAccount() {
        System.out.println("banned account");
    }

    public void lockAccount() {
        System.out.println("locked account");
    }

    public void unlockAccount() {
        System.out.println("unlocked account");
    }

    public void viewSecurityLog() {
        System.out.println("viewing security log");
    }
}
