package com.example.olivia.myapplication.model;

/**
 * Created by naoto on 2/20/2017.
 *
 * created to be used in the spinner when a user must choose during registration
 */

public enum userType {
    ADMIN("AD"),
    WORKER("WK"),
    MANAGER("MG"),
    USER("US");

    private String userType;

    private userType(String userType) {
        this.userType = userType;
    }
}
