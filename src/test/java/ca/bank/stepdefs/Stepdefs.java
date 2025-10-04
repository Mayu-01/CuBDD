package ca.bank.stepdefs;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

import java.io.File;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Stepdefs {
    RequestSpecification requestSpec;
    Response response;
    ValidatableResponse validatableResponse;


    @Given("user points to service {string}")
    public void user_points_to_service(String string) {
        System.out.println(string);
        RestAssured.baseURI ="https://api.restful-api.dev";

        RestAssured.useRelaxedHTTPSValidation();
        RequestSpecification requestSpec = given();
//        System.out.println("outside reqspec");
//        System.out.println(" req Spec is :"+requestSpec);
//        RestAssured.given().log().all().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false)));
    }

    @When("user having following headers")
    public void user_having_following_headers(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("inside When header");
        Map<String, String> hParams = dataTable.asMap(String.class, String.class);
        for (Map.Entry<String, String> entry : hParams.entrySet()) {
            System.out.println("hi");
//            requestSpec.header(entry.getKey(), entry.getValue());
//            requestSpec.header(entry.getKey(), entry.getValue());
        }
    }

    @When("user issues {string} request to {string}")
    public void user_issues_request_to(String string, String string2) {
        System.out.println("inside user issues");
        switch (string) {
            case "GET":
                response = requestSpec.get(string2);
                System.out.println(response.asPrettyString());
                break;
            case "POST":
//                response = requestSpec.post(string2);
                response=requestSpec.post(string2);
                System.out.println(response.asPrettyString());
                break;
            case "PUT":
                response = requestSpec.put(string2);
                System.out.println(response.asPrettyString());
                break;
            case "PATCH":
                response = requestSpec.patch(string2);
                System.out.println(response.asPrettyString());
                break;
        }
        validatableResponse = response.then();
    }

    @Then("verify below json values")
    public void verify_below_json_values(DataTable dataTable) {
        Map<String, String> nodes = dataTable.asMap(String.class, String.class);
//        JSONArray arr = new JSONArray(response.asPrettyString());
//        for (int i = 0; i <= arr.length()-1; i++) {
//            JSONObject obj=arr.getJSONObject(i);
        for (Map.Entry<String, String> eachNode : nodes.entrySet()) {
            String jsonPath = eachNode.getKey();
            String expjsonValue = eachNode.getValue();
//
            String actJsonvalue = response.getBody().jsonPath().get(jsonPath).toString();
            System.out.println(actJsonvalue);
            assertThat(expjsonValue, Matchers.containsString(actJsonvalue));

        }
    }


    @When("user has following body")
    public void user_has_following_body(io.cucumber.datatable.DataTable dataTable) {
        List<String> lst = dataTable.asList(String.class);
        File file = new File("./src/test/java/jsonFiles/test.json/");
        requestSpec.body(file);
    }


    @Then("status code should be {string}")
    public void status_code_should_be(int string) {
        if (string >= 400 && string <= 599) {
            System.out.println("Error status code is: " + response.getStatusCode());
        } else {
            assertEquals(string, response.getStatusCode());
            System.out.println("Response code is: " + response.getStatusCode());
        }
    }
}

