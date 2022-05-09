package ruthe;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment05 {
	Response response;
	@Given("Open URL")
	public void open_url() {
		RestAssured.baseURI = "https://reqres.in/";
		
	}

	@When("give Wrong API link")
	public void give_wrong_api_link() {
		response = RestAssured.get("ai/login");

	}

	@Then("verifying link")
	public void verifying_link() {
		Assert.assertEquals(404, response.getStatusCode());
		System.out.println(response.getStatusCode());

	}
}
