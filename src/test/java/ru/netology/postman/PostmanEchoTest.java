package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    @Test
    void PostmanEchoTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello World!")
                .when()
                .post("/post")
                .then()
                .statusCode(200);
                //.body("data", equalTo("some value"));
    }
}
