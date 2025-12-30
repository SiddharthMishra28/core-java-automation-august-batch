package com.selenium.tests;

import com.selenium.config.Lifecycle;
import org.testng.annotations.Test;

public class Guru99LoginTest extends Lifecycle {

    @Test
    public void loginTest() {
        driver.get("https://demo.guru99.com/V4/");
    }
}
