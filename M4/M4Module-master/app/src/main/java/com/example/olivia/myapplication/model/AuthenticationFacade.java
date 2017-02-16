package com.example.olivia.myapplication.model;

/**
 * Created by Olivia on 2/12/2017.
 */

public interface AuthenticationFacade {
    boolean handleLoginRequest(String name, String password);
}