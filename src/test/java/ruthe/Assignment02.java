package ruthe;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment02 {

	RequestSpecification httpRequest;
	Response response;
	@Given("URL")
	public void url() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://reqres.in";
		httpRequest = RestAssured.given().header("content-type","application/json")
		.body("{\r\n"
		+ " \"email\": \"eve.holt@reqres.in\",\r\n"
		+ " \"password\": \"cityslicka\"\r\n"
		+ "}");
	}

	@When("Loging data on console")
	public void loging_data_on_console() {
	    // Write code here that turns the phrase above into concrete actions
		response = httpRequest.post("api/login").then().extract().response();

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
