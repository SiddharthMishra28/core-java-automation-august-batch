package com.selenium.browserinteractions.testing.sanity;

import org.testng.annotations.Test;

public class AuthTests {

    @Test
    public void validLoginCredentialsTest() {
        System.out.println("Login done..Test successful..");
    }

    @Test
    public void invalidLoginCredentialsTest() {
        System.out.println("Login Failed.. Test Successful");
    }
}
