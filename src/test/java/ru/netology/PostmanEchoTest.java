package ru.netology;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    void shouldReturnBodyPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Welcome to Postman Echo")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("Welcome to Postman Echo"));

    }

}
