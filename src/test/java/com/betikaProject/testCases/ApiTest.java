package com.betikaProject.testCases;

import org.testng.annotations.Test;
import org.testng.*;
import static io.restassured.RestAssured.given;



public class ApiTest {
    public String apiUrl = "https://fakerestapi.azurewebsites.net/api/v1/Users";
    @Test
    public void testResponseStatusCode(){
          int statusCode = given().when().get(apiUrl).getStatusCode();
          Assert.assertEquals(statusCode,200);
    }

    @Test
    public void testUser6InResponse(){
        String responseBody = given().get(apiUrl).getBody().asString();
        System.out.println(given().when().get(apiUrl).body());

    }
}
