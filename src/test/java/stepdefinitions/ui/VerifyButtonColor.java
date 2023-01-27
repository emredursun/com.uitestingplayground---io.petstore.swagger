package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class VerifyButtonColor {

    private final BasePage basePage = new BasePage();
    private  String initialElementColor;
    private WebElement el;

    // Save the initial color of the button via a dynamic attribute value of the given WebElement
    @When("I save the color value of the {string} button")
    public void i_save_the_color_value_of_the_button(String buttonText) {
        el = basePage.getElementWithText(buttonText);
        initialElementColor = el.getAttribute("class");
    }

    // Click to the given button to verify that the class attribute value changed
    @When("I click to {string} button")
    public void i_click_to_button(String buttonText) {
        basePage.getElementWithText(buttonText).click();
    }
    @Then("I verify that the color is changed")
    public void i_verify_that_the_color_is_changed() {
        String currentElementColor = el.getAttribute("class");
        Assert.assertNotEquals(currentElementColor, initialElementColor);
    }
}
