package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetNameCucuccc {
	
	Response res;
	  ValidatableResponse validate;
	@When("User is able to retrive  name by using an api is {string}")
	public void user_is_able_to_retrive_name_by_using_an_api_is(String url) {
		 res = RestAssured.get(url);
	   
	}

	@Then("User validate the status code of getby name data  {int}")
	public void user_validate_the_status_code_of_getby_name_data(Integer int1) {
		  validate = res.then();
		  validate.assertThat().statusCode(int1).log().all();
	    
	}

	

}
