package com.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Lifecycle {

    public static Properties configProps;
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        configProps = readConfig();
    }

    @BeforeTest
    public void beforeTest() {}

    @BeforeMethod
    public void beforeMethod(){
        setupBrowser();
    }

    @AfterMethod
    public void afterMethod(){
        closeBrowser();
    }

    @AfterTest
    public void afterTest(){

    }

    @AfterSuite
    public void afterSuite(){

    }

    public static Properties readConfig() {
        try {
            FileInputStream fis = new FileInputStream(new File("src/test/resources/config.properties"));
            Properties properties = new Properties();
            properties.load(fis);
            return properties;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setupBrowser() {
        if(configProps.getProperty("browser").equalsIgnoreCase("CHROME")) {
            driver = new ChromeDriver();
        }else if(configProps.getProperty("browser").equalsIgnoreCase("EDGE")) {
            driver = new EdgeDriver();
        }
        if(configProps.getProperty("isFullScreen").equalsIgnoreCase("TRUE")) {
            driver.manage().window().maximize();
        }
    }

    public void closeBrowser() {
        driver.quit();
    }
}
