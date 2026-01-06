package com.selenium.tests;

import com.selenium.config.Lifecycle;
import com.selenium.pages.Homepage;
import com.selenium.utils.CommonUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Guru99LoginTest extends Lifecycle {

    // GENERIC TEST CASE
//    @Test
//    public void loginTest() {
//        Homepage homepage = new Homepage(driver);// CONSTRUCTOR INJECTION
//        CommonUtils utils = new CommonUtils(driver);
//        utils.navigate("https://demo.guru99.com/V4/");
//        utils.type(homepage.usernameField, "mngr643764");
//        utils.type(homepage.passwordField, "ujuturE");
//    }

    // BUSINESS TEST CASE
    @Test
    public void loginBusinessTest() {
        Homepage homepage = new Homepage(driver);
        homepage.login("https://demo.guru99.com/V4/","mngr643764", "ujuturE");
    }

//    @DataProvider
//    public String[][] getData() {
//        return new String[][] data; // Should call a Re-usable data reader method
//    }
}
