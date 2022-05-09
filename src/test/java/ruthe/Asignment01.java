package ruthe;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Asignment01 {
	Response response;
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://reqres.in/";
	}

	@When("posted with correct Information")
	public void posted_with_correct_information() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("api/unknown/2");
		System.out.println(response.getContentType());
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
