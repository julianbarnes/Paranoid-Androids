package com.example.olivia.myapplication.model;

/**
 * Created by Olivia on 2/12/2017.
 */

public interface UserManagementFacade {
    void addUser(String id, String name, String pass, String email, String address, String userType);
    User findUserById(String id);
}