package com.selenium.browserinteractions.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElementInteraction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr643764");
        driver.findElement(By.name("password")).sendKeys("ujuturE");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(3000);
        List<WebElement> menuOptions = driver.findElements(By.xpath("//div/ul[@class='menusubnav']/li/a"));
        for(WebElement el : menuOptions) {
//            System.out.println(el.getText());
            el.click();
        }
//        driver.findElement(By.xpath("//a[text()='New Account']")).click();
//        List<WebElement> dropdownElements = driver.findElements(By.xpath("//select/option"));
//        for(WebElement el : dropdownElements) {
//            System.out.println(el.getText());
//        }
        driver.quit();
    }
}
