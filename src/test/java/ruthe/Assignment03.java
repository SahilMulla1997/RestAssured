package ruthe;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment03 {
	Response response;
	
	@Given("Get URI")
	public void get_uri() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "https://reqres.in";
		
	}

	@When("Giving EndPoints")
	public void giving_end_points() {
	    // Write code here that turns the phrase above into concrete actions
		response = RestAssured.get("/api/users/2");
	}

	@Then("Validate Two Responce")
	public void validate_two_responce() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getContentType(), "application/json; charset=utf-8");
	}
}
