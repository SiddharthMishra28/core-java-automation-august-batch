package com.selenium.browserinteractions.testing.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ReportDemoTest {

    WebDriver driver;
    ExtentReports extent = new ExtentReports();
    ExtentTest test;

    @BeforeTest
    public void reportSetup() {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setup() {
        test = extent.createTest("Browser Initializing..");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCaseOne() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        test.log(Status.PASS, "Google Title Verified Successfully!");
    }

    @Test
    public void testCaseTwo() {
        driver.get("https://www.flipkart.com");
        Assert.assertEquals(driver.getTitle(), "Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com");
        test.log(Status.PASS, "Flipkart Title Verified Successfully!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterTest
    public void publish() {
        extent.flush();
    }
}
