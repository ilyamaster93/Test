package endpoints;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

public class Endpoints {
    public static Response getListOfUsers(String url) {
        return RestAssured.get(url);
    }

    public static Response createUser(String url, Map<String, Object> body) throws IOException {
        return (Response) RestAssured.given()
                .contentType(ContentType.JSON) // Specify the content type as JSON
                .body(body) // Set the JSON object as the request body
                .post(url)
                .then()
                .log()
                .all()
                .and()
                .extract()
                .response();
    }

    public static Response updateUser(String url, Map<String, Object> body, String requestType) {
        Response response = null;
        if (requestType.equalsIgnoreCase("put")) {
            response = (Response) RestAssured.given()
                    .contentType(ContentType.JSON) // Specify the content type as JSON
                    .body(body) // Set the JSON object as the request body
                    .put(url)
                    .then()
                    .log()
                    .all()
                    .and()
                    .extract()
                    .response();
        }

        if (requestType.equalsIgnoreCase("patch")) {
            response = (Response) RestAssured.given()
                    .contentType(ContentType.JSON) // Specify the content type as JSON
                    .body(body) // Set the JSON object as the request body
                    .patch(url)
                    .then()
                    .log()
                    .all()
                    .and()
                    .extract()
                    .response();
        }
        return response;
    }

    public static Response deleteUser(String url) {
        return RestAssured.delete(url);
    }
}
