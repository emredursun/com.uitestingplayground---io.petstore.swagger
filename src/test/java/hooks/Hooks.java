package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Api;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    @Before(value= "@ui")
    public void setUp(){
        utilities.Driver.getDriver().get(ConfigurationReader.getProperty("base_url_ui"));
    }

    @After(value= "@ui")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) utilities.Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }

    @After(value = "@deletePet")
    public void deletePet(){
        String endpoint = String.format("%s/%s", ConfigurationReader.getProperty("pet"), System.getProperty("pet_id"));
        Api.delete(endpoint).statusCode(200);
    }
    @After(value = "@deleteStore")
    public void deleteStore(){
        String endpoint = String.format("%s/%s", ConfigurationReader.getProperty("store"), System.getProperty("store_id"));
        Api.delete(endpoint).statusCode(200);
    }
    @After(value = "@deleteUser")
    public void deleteUser(){
        String endpoint = String.format("%s/%s", ConfigurationReader.getProperty("user"), System.getProperty("user_name"));
        Api.delete(endpoint).statusCode(200);
    }
}
