package com.selenium.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {


    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        System.out.println("Navigating to "+url);
    }

    @When("I login with userId and password")
    public void i_login_with_user_id_and_password() {
        System.out.println("When Step...");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("When Step...");
    }

    @Then("I should land into dashboard page")
    public void i_should_land_into_dashboard_page() {
        System.out.println("Then Step...");
    }
}
