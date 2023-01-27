package stepdefinitions.ui;

import io.cucumber.java.en.*;

public class BaseSteps {

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {

    }
    @When("I click to {string} link")
    public void i_click_to_link(String string) {

    }
    @Then("I verify that the page title is {string}")
    public void i_verify_that_the_page_title_is(String string) {

    }
    @When("I save the color value of the {string} button")
    public void i_save_the_color_value_of_the_button(String string) {

    }
    @When("I click to {string} button")
    public void i_click_to_button(String string) {
    }
    @Then("I verify that the color is changed")
    public void i_verify_that_the_color_is_changed() {

    }
}
