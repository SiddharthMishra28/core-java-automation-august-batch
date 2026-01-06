package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonUtils {

    WebDriver driver;

    // CONSTRUCTOR TO ACCEPT WEBDRIVER INSTANCE
    public CommonUtils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Helps the page navigate to a provided url
     * @param url
     */
    public void navigate(String url) {
        driver.get(url);
    }

    /**
     * Clicks on provided WebElement
     * @param locator
     */
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * Types into provided web Element
     * @param locator
     * @param keyStrokes
     */
    public void type(By locator, String keyStrokes) {
        driver.findElement(locator).sendKeys(keyStrokes);
    }
}
