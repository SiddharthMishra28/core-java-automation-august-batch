package com.selenium.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"com.selenium.bdd.steps", "com.selenium.bdd.lifecycle"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "com.selenium.bdd.reporting.ReportListener"
        }
)
@RunWith(Cucumber.class)
public class Runner {
}
