package stepdefinitions.api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.Pet;
import utilities.Api;
import utilities.ConfigurationReader;

public class PetSteps {

    private Pet petRes;

    @When("I send POST request to pet endpoint with following pet data:")
    public void i_send_post_request_to_pet_endpoint_with_following_pet_data(Pet petDt) {
        String endpoint = ConfigurationReader.getProperty("pet");
        petRes = Api.post(endpoint, petDt).as(Pet.class);

        System.setProperty("pet_id", petRes.getId());
    }

    @Then("response body for creating pet should be:")
    public void response_body_for_creating_pet_should_be(Pet petDt) {
        Assert.assertEquals(petDt, petRes);
    }
}
