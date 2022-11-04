package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getreq {
	Response res;
	ValidatableResponse validate;
	
	@When("user is getting the single data by using the api is {string}")
	public void user_is_getting_the_single_data_by_using_the_api_is(String strin) {
		  res = RestAssured.get(strin);
	    
	}

	@Then("Use checks the status code is {int}")
	public void use_checks_the_status_code_is(Integer int1) {
		 validate = res.then();
		 validate.assertThat().statusCode(int1).log().all();
	     
	}

}
