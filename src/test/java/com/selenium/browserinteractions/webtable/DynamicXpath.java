package com.selenium.browserinteractions.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
    static WebDriver driver;
//    public static void main(String[] args) {
////        String xpath = "//table[@id='countries']/tbody/tr[rowNum]/td[colNum]";
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://cosmocode.io/automation-practice-webtable/");
//        int numRows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
//        for(int i=1; i<=numRows; i++) {
//            WebElement element = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[4]"));
//            String currency = element.getText();
//            System.out.println(currency);
//        }
//        driver.quit();
//    }
        public static void main(String[] args) throws InterruptedException {
            driver = new ChromeDriver();
            driver.get("https://cosmocode.io/automation-practice-webtable/");
            int rowCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
            int colCount = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")).size();
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


        public void searchAndClick(String searchText) {
            driver.findElement(By.xpath("//table[@id='countries']/tbody//td[text()='"+searchText+"']"));
        }
}
