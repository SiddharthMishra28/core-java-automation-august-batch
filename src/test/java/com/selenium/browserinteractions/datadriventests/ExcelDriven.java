package com.selenium.browserinteractions.datadriventests;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDriven {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "loginProvider")
    public void loginTest(String userId, String password) {
        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys(userId);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();
        String title = driver.getTitle();
        Assert.assertEquals(" Guru99 Bank Manager HomePage ".trim(), title);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @DataProvider(name = "loginProvider")
    public String[][] loginDataProvider() throws IOException {
        return excelDataReader("./Data.xlsx", "loginData");
    }

    public String[][] excelDataReader(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sh = wb.getSheet(sheetName);
        int rowCount = sh.getLastRowNum(); // for human like reading use getPhysicalNumRows()
        int colCount = sh.getRow(0).getLastCellNum();
        String[][] xlData = new String[rowCount + 1][colCount];
        for(int i=1; i<=rowCount; i++) {
            for(int j=0; j<colCount; j++) {
                xlData[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return xlData;
    }

}
