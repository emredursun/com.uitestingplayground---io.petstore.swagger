package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Api {
    private static final String BASE_URI = ConfigurationReader.getProperty("base_url_api");

    public static String STATUS_CODE = "STATUS_CODE";

    private static RequestSpecification getRequest() {
        return given()
                .baseUri(BASE_URI)
                .headers(getHeaderSpecs())
                .when();
    }

    private static Map<String, Object> getHeaderSpecs() {
        Map<String, Object> headerSpecs = new HashMap<>();
        headerSpecs.put("Content-Type", ContentType.JSON);
        headerSpecs.put("Accept", ContentType.JSON);

        return headerSpecs;
    }

    public static Response post(String endpoint, Object reqBody) {
        Response res = getRequest().body(reqBody).post(endpoint);
        System.setProperty(STATUS_CODE, String.valueOf(res.statusCode()));

        return res;
    }

    public static ValidatableResponse delete(String endpoint) {
        return getRequest().delete(endpoint).then();
    }
}
