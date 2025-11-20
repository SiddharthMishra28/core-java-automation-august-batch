package com.selenium.browserinteractions.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardcodedWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        Thread.sleep(5200);
        driver.findElement(By.id("txt1")).sendKeys("Some Value");
        Thread.sleep(2000);
        driver.quit();
    }
}
