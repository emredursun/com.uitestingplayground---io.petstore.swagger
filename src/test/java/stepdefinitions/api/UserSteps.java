package stepdefinitions.api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.GenericResponse;
import pojos.User;
import utilities.Api;
import utilities.ConfigurationReader;

public class UserSteps {

    private GenericResponse userRes;
    @When("I send POST request to user endpoint with following user data:")
    public void i_send_post_request_to_user_endpoint_with_following_user_data(User userDt) {
        String endpoint = ConfigurationReader.getProperty("user");
        userRes = Api.post(endpoint, userDt).as(GenericResponse.class);

        System.setProperty("user_name", userDt.getUsername());
    }

    @Then("response body for creating user should be:")
    public void response_body_for_creating_user_should_be(GenericResponse userResDt) {
        Assert.assertEquals(userResDt, userRes);
    }
}
