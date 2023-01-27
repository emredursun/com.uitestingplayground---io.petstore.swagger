package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BasePage;
import pages.HomePage;
import utilities.Driver;
import utilities.Selenium;

public class BaseSteps {

    private final HomePage homePage = new HomePage();
    private final BasePage basePage = new BasePage();

    private String actualAttributeValue;

    // Navigate to 'http://www.uitestingplayground.com/home' home page
    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        homePage.clickLinkWithText("Home");
    }

    // Navigate to given 'LinkWithText' with a single click. LinkTexts: Click, Dynamic ID, Verify Text
    @When("I click to {string} link")
    public void i_click_to_link(String linkText) {
        homePage.clickLinkWithText(linkText);
    }

    // Verify via getTitle() method that I am on the expected page. expectedTitles: Click, Dynamic ID, Verify Text which come from ui features dynamically
    @Then("I verify that the page title is {string}")
    public void i_verify_that_the_page_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    // Verify that the expected text is displayed. The method received a String parameter from verifyText.feature dynamically
    @Then("I verify that {string} text is displayed")
    public void i_verify_that_text_is_displayed(String text) {
        boolean isDisplayed = Selenium.isElementDisplayed(basePage.getElementContainsText(text));
        Assert.assertTrue(String.format("Element with '%s' text is not displayed!", text), isDisplayed);
    }

    // Save actual value of the given attribute in a String with the bellow method which takes two
    // parameters: buttonText and attributeName
    @When("I save the value of the {string} button's {string} attribute")
    public void i_save_the_value_of_the_button_s_attribute(String buttonText, String attributeName) {
        actualAttributeValue = basePage.getElementWithText(buttonText).getAttribute(attributeName);
    }

    // Refresh the page to verify that the given WebElement has a Dynamic ID
    @When("I refresh the page")
    public void i_refresh_the_page() {
        Driver.getDriver().navigate().refresh();
    }

    // Verify if any given WebElement has a Dynamic ID by comparing saved initial value with its final value after you refreshed the page
    @Then("I verify that the value of {string} button's {string} attribute is different")
    public void i_verify_that_the_value_of_button_s_attribute_is_different(String buttonText, String attributeName) {
        String unexpectedAttributeValue = basePage.getElementWithText(buttonText).getAttribute(attributeName);
        Assert.assertNotEquals(unexpectedAttributeValue, actualAttributeValue);
    }
}
