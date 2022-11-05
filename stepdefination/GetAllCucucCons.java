package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllCucucCons {
	Response res;
	ValidatableResponse validate;
	@When("User is able to retrive the data by using an api is {string}")
	public void user_is_able_to_retrive_the_data_by_using_an_api_is(String url) {
		res = RestAssured.get(url);
	 
	}

	@Then("User is will validate the status code is {int}")
	public void user_is_will_validate_the_status_code_is(Integer int1) {
		  validate = res.then();
		  validate.assertThat().statusCode(int1).log().all();
	    
	}
}
