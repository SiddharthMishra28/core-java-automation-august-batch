package com.selenium.browserinteractions.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7)); // CONFIGURED NUMBER OF SECONDS TO WAIT BEFORE THROWING AN ERROR
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        driver.findElement(By.id("txt1")).sendKeys("Some Value");
        Thread.sleep(2000); // NOT RECOMMENDED
        driver.quit();
    }
}
