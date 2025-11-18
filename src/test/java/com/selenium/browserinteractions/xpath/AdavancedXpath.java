package com.selenium.browserinteractions.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdavancedXpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr643764");
        driver.findElement(By.name("password")).sendKeys("ujuturE");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(fetchWebElement("a", "New Customer")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    public static By fetchWebElement(String element, String text) {
        return By.xpath("//"+element+"[text()='"+text+"']");
    }
}
