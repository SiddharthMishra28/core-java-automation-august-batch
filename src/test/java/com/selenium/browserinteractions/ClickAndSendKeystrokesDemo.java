package com.selenium.browserinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndSendKeystrokesDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr643764");
        driver.findElement(By.name("password")).sendKeys("ujuturE");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
            System.out.println("Login Successful!");
        }else {
            System.out.println("Login Failed!");
        }
        driver.quit();
    }
}
