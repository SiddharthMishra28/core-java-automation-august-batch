package com.selenium.bdd.lifecycle;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    public WebDriver driver;
    public static Properties configProps;

    // EXECUTED ONLY ONCE PER CYCLE AND HENCE STATIC
    @BeforeAll
    public static void beforeAll() {
        readConfig();
    }

    @Before
    public void before() {
        setupBrowser();
    }

    public static void readConfig() {
        try {
            FileInputStream fis = new FileInputStream(new File("src/test/resources/config.properties"));
            configProps = new Properties();
            configProps.load(fis);
            System.out.println(configProps.getProperty("browser"));
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

        if(configProps.getProperty("fullscreen").equalsIgnoreCase("TRUE")) {
            driver.manage().window().maximize();
        }
    }
}
