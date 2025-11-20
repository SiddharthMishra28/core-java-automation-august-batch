package com.selenium.browserinteractions.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
//        driver.switchTo().alert().accept(); // OK BUTTON CLICK
        driver.switchTo().alert().dismiss(); // CANCEL / NO / NEGATIVE RESPONSE CLICK
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
