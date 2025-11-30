package com.selenium.browserinteractions.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgHooks {

    @AfterTest
    public void runAfter() {
        System.out.println("I'll run after Test Ends");
    }

    @BeforeTest
    public void runBefore() {
        System.out.println("I'll run before Test starts...");
    }

    @Test
    public void webTableTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        int rowCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
        int colCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")).size();
        Assert.assertEquals(rowCount, 197);
        Assert.assertEquals(colCount, 5);
        for(int i=1; i<=rowCount; i++) {
            String searchText = "English";
            String actualText = driver.findElement(By.xpath(("//table[@id='countries']/tbody/tr["+i+"]/td[5]"))).getText();
            if(actualText.equalsIgnoreCase(searchText)) {
                driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[1]/input")).click();
            }
        }
        driver.quit();
    }


}
