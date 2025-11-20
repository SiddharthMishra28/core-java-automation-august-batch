package com.selenium.browserinteractions.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr643764");
        driver.findElement(By.name("password")).sendKeys("ujuturE");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[text()='Log out']")).click();
        driver.get("https://demo.guru99.com/V4/manager/Logout.php");
        driver.switchTo().alert().accept(); // USED TO INTERACT WITH ALERTS
        driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(), 'Selenium')]")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
