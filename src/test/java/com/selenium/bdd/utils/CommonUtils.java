package com.selenium.bdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonUtils {

    WebDriver driver;

    public CommonUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void type(By element, String keyStrokes) {
        driver.findElement(element).sendKeys(keyStrokes);
    }
}
