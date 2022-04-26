package configuration;
/**
 * Created By Rubens Matos on 04-20-2022
 */
import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class BaseSetup {
    @BeforeClass
    public void setup () {

        RequestSpecification request = new RequestSpecBuilder ().addHeader ("Content-Type", "application/json")
                .setBaseUri ("https://reqres.in/")
                .addHeader ("Content-Type", "application/json")
                .addHeader ("Accept", "application/json")
                .addFilter (new RequestLoggingFilter ())
                .addFilter (new ResponseLoggingFilter ())
                .build ();

        ResponseSpecification response = new ResponseSpecBuilder ().expectResponseTime (lessThan (5000L))
                .build ();

        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
