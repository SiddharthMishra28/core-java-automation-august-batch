package com.selenium.pages;

import com.selenium.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends CommonUtils {

    public By usernameField = By.name("uid");
    public By passwordField = By.name("password");
    public By loginButton = By.name("btnLogin");

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void login(String url, String username, String password) {
        navigate(url);
        type(usernameField, username);
        type(passwordField, password);
        clickElement(loginButton);
    }
}
