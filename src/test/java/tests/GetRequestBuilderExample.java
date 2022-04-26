package tests;

import com.github.javafaker.Faker;
import data.UserData;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class GetRequestBuilderExample extends SetupConfig {

    @Test
    public void getBuilderPattern () {

        //UserData userData = userDataBuilder ();
        given ()//.body (userData)
                .when ()
                .get ("/api/users")
                .then ()
                .statusCode (200);
              //  .and ()
                //.assertThat ()
                //.body ("name", equalTo (userData.getName ()))
               // .body ("job", equalTo (userData.getJob ()));

    }

   /* private UserData userDataBuilder () {
        Faker faker = Faker.instance ();
        return UserData.builder ()
                .name (faker.name ()
                        .firstName ())
                .job (faker.company ()
                        .profession ())
                .build ();
    }*/

}