package homeworks.homework31;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;


import static io.restassured.RestAssured.given;
import static lessons.lesson31.Specification.*;

public class CreateUser {

    private final String BASE_URL = "https://reqres.in";
    private final String EXPECTED_NAME = "morpheus";
    private final String EXPECTED_JOB = "leader";
    private final String EXPECTED_CREATION_DATE = LocalDateTime.now().toString().substring(0, 10);

    @Test
    public void createUser() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(201));
        UsersDataRequest usersDataRequest = new UsersDataRequest("morpheus", "leader");
        UsersDataResponse usersDataResponse = given()
                .body(usersDataRequest)
                .when()
                .post("/api/users")
                .then().log().all()
                .extract().as(UsersDataResponse.class);
        Assert.assertEquals(usersDataResponse.getName(), EXPECTED_NAME);
        Assert.assertEquals(usersDataResponse.getJob(), EXPECTED_JOB);
        Assert.assertFalse(usersDataResponse.getId().isEmpty());
        Assert.assertEquals(usersDataResponse.getCreatedAt().substring(0, 10), EXPECTED_CREATION_DATE);
    }
}
