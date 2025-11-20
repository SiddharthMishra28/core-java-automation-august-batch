package com.selenium.browserinteractions.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputField {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li/a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();
//        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello there!!");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
