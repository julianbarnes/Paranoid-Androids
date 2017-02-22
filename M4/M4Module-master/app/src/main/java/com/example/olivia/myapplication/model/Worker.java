package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/18/2017.
 *  a sub class of user. Can do everything that a user can do plus an added method
 *  ReportWaterPurity that that lets Workers view water purity
 *
 */

public class Worker extends User {

    /**
     *contructor for worker class. Creates a new worker class when initialized
     * @param id is the user id
     * @param name stands for name for user name
     * @param password stands for password for user password
     * @param email stands for email for user email
     * @param address stands for address for user address
     * @param userType stands for userType
     */
    public Worker(String id, String name, String password, String email, String address, String userType) {
        super(id, name, password, email, address, userType);
    }

    /**
     * a method that should be implemented later on. Specific to Worker class, which enables them
     * to report on water purity
     */
    public void ReportWaterPurity() {
        System.out.println("Report water purity");
    }
}
