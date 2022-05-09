package ruthe;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment04 {
	Response response;
	@Given("Give API for foreign exchange")
	public void give_api_for_foreign_exchange() {
		RestAssured.baseURI = "https://reqres.in/";
	}

	@When("Post Create correct responce information")
	public void post_create_correct_responce_information() {
	    response = RestAssured.get("api/users/dc");
		Response response = RestAssured.given().log().all().header("Content-type", "application/json")
	    		.when().get("https://reqres.in/api/users/dc")
	    		.then().log().all().statusCode(404).extract().response();
	}

	@Then("validating the outcomes")
	public void validating_the_outcomes() {
		Assert.assertEquals(404, response.getStatusCode());
	}
}
