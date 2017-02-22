package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *
 *  a sub class of user. takes in a name and a password
 *
 */

public class Admin extends Manager {

    public Admin(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    /**
     * a method specific to administrators that enables them to delete other user accounts
     */
    public void deleteAccount() {
        System.out.println("delete account");
    }

    /**
     * administrator method that enables them to ban certain users
     */
    public void banAccount() {
        System.out.println("banned account");
    }

    /**
     * administrator method that lets them lock user accounts
     */
    public void lockAccount() {
        System.out.println("locked account");
    }

    /**
     * in a event that the administrator locked an account accidentally, they can use this method
     * to unlock that account
     */
    public void unlockAccount() {
        System.out.println("unlocked account");
    }

    /**
     * a method that lets administrator to view security log
     */
    public void viewSecurityLog() {
        System.out.println("viewing security log");
    }
}
