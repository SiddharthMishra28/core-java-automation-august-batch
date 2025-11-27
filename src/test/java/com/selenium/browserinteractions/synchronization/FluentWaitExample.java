package com.selenium.browserinteractions.synchronization;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(TimeoutException.class)
                .ignoring(NoSuchElementException.class);

        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver1) {
                WebElement el = driver.findElement(By.id("txt1"));
                if(el.isDisplayed()) {
                    return el;
                }
                return null;
            }
        });
        element.sendKeys("Some Text Goes Here...");
        Thread.sleep(3000);
        driver.quit();
    }
}
