package org.daemon.revenant;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
class BaseResourceTest {

        @Test
        public void testBaseEndpoint() {
                given()
                                .contentType(ContentType.JSON)
                                .when().get("/")
                                .then().statusCode(200)
                                .body("name", is("foo"))
                                .body("value", is("bar"));
        }
}
