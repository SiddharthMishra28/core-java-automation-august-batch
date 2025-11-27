package com.selenium.browserinteractions.synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn1")));
        btn.click();
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        input.sendKeys("Some Text...");
        Thread.sleep(3000);
        driver.quit();
    }
}
