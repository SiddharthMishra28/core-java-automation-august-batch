package com.selenium.bdd.steps;

import com.selenium.bdd.lifecycle.Hooks;
import com.selenium.bdd.pages.Homepage;
import com.selenium.bdd.utils.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    CommonUtils utils = new CommonUtils(Hooks.driver);
    Homepage homepage = new Homepage(Hooks.driver);


    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        utils.navigate(url);
    }

    @When("I login with {string} and {string}")
    public void i_login_with_and(String userid, String password) {
        homepage.Login(userid, password);
    }

    @Then("I verify the title to be {string}")
    public void i_should_land_into_dashboard_page(String title) {
        utils.verifyTitle(title);
    }
}
