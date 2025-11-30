package com.selenium.browserinteractions.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasicValidationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        int rowCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
        int colCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")).size();
        Assert.assertEquals(rowCount, 200);
        Assert.assertEquals(colCount, 5);
        for(int i=1; i<=rowCount; i++) {
            String searchText = "English";
            String actualText = driver.findElement(By.xpath(("//table[@id='countries']/tbody/tr["+i+"]/td[5]"))).getText();
            if(actualText.equalsIgnoreCase(searchText)) {
                driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[1]/input")).click();
            }
        }
        Thread.sleep(10000);
        driver.quit();
    }
}
