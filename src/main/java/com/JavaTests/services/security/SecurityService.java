package com.JavaTests.services.security;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);

}