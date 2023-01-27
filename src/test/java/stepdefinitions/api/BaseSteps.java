package stepdefinitions.api;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Api;

public class BaseSteps {

    @Then("status code is {int}")
    public void status_code_is(int expectedStatusCode) {
        int actualStatusCode = Integer.parseInt(System.getProperty(Api.STATUS_CODE));
        Assert.assertEquals(expectedStatusCode, actualStatusCode);
    }
}
