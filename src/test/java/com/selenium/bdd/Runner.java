package com.selenium.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources",
        glue = "com.selenium.bdd.steps"
)
@RunWith(Cucumber.class)
public class Runner {
}
