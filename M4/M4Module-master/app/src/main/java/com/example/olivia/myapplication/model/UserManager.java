package com.example.olivia.myapplication.model;

import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Olivia on 2/12/2017.
 *
 * a class that initializes a HashMap that holds all of our user accounts.
 */


public class UserManager implements AuthenticationFacade, UserManagementFacade {
    User u;// Modified by Rayna to enable accessing the user from LoginActivity

    private static Map<String, User> users = new HashMap<>();

    public User findUserById(String id) {
        return users.get(id);
    }

    /**
     * constructor that, when initialized, creates a new user object with the following parameters
     *
     * @param id user id from registration page
     * @param name user name from registration page
     * @param pass user password from registration page
     * @param email user email from registration page
     * @param address user home address from registration page
     * @param userType user type that he/she must choose from a spinner
     *
     */
    public void addUser(String id, String name, String pass, String email, String address, String userType) {
        User userObject = new User(id, name, pass, email, address, userType);
        users.put(id, userObject);
    }

    public void deleteUser(String id) {
        users.remove(id);
    }


    public boolean handleLoginRequest(String id, String pass) {
        u = findUserById(id);//Modified by Rayna
        return u!=null && u.checkPassword(pass);
    }
    public User getUser(){ // Added by Rayna
        return u;
    } // Added by Rayna



}
