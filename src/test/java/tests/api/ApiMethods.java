package tests.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static tests.logger.CustomLogger.logger;

public class ApiMethods {
    public static void main(String[] args) {
        methodGet("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)" +
                " Chrome/85.0.4183.102 Safari/537.36", "https://api.myip.com/");
    }

    public static void methodGet(String userAgent, String andPoint) {
        logger.info("Reqest to endpoint: " + andPoint);
        logger.info("User arent: " + userAgent);
        Response response =
                (Response) given()
                        .contentType("application?json")
                        .header("User-Agent", userAgent)
                        .when()
                        .get(andPoint)
                        .then().statusCode(200)
                        .extract()
                        .response();
        logger.info("Response: " + response.asString() + "\n");


    }


}
