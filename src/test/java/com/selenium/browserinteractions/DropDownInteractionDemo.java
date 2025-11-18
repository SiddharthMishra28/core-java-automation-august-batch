package com.selenium.browserinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInteractionDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr643764");
        driver.findElement(By.name("password")).sendKeys("ujuturE");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='New Account']")).click();
        Select accType = new Select(driver.findElement(By.name("selaccount")));
        accType.selectByVisibleText("Current");
        Thread.sleep(2000);
        driver.quit();
    }
}
