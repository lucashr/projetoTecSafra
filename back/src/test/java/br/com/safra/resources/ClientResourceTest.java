package br.com.safra.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class ClientResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/client/equity/1")
          .then()
             .statusCode(200);
    }

}