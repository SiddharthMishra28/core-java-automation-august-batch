package com.selenium.bdd.pages;

import com.selenium.bdd.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends CommonUtils {

    public By usernameField = By.name("uid");
    public By passwordField = By.name("password");
    public By loginButton = By.name("btnLogin");

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void Login(String username, String password) {
        type(usernameField, username);
        type(passwordField, password);
        clickElement(loginButton);
    }
}
