package stepdefinitions.api;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.Store;
import utilities.Api;
import utilities.ConfigurationReader;

public class StoreSteps {

    private Store storeRes;

    @When("I send POST request to store endpoint with following store data:")
    public void i_send_post_request_to_store_endpoint(Store storeDt) {
        String endpoint = ConfigurationReader.getProperty("store");
        storeRes = Api.post(endpoint, storeDt).as(Store.class);

        System.setProperty("store_id", storeRes.getId());
    }

    @Then("response body for creating store order should be:")
    public void response_body_for_creating_store_order_should_be(Store storeDt) {
        Assert.assertEquals(storeDt, storeRes);
    }
}
