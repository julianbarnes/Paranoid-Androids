package com.example.olivia.myapplication.model;

/**
 * Created by Olivia on 2/12/2017.
 */

public interface UserManagementFacade {
    void addUser(String name, String pass);
    User findUserById(String id);
}