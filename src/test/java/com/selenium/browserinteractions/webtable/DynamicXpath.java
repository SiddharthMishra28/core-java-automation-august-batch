package com.selenium.browserinteractions.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
    public static void main(String[] args) {
//        String xpath = "//table[@id='countries']/tbody/tr[rowNum]/td[colNum]";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        int numRows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
        for(int i=1; i<=numRows; i++) {
            WebElement element = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[4]"));
            String currency = element.getText();
            System.out.println(currency);
        }
        driver.quit();
    }
}
