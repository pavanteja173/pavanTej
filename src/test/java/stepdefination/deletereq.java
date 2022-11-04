package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
 

public class deletereq {
	Response res;
	ValidatableResponse validate;
 
	@When("user select the particular data then the dtata should be deleted {string}")
	public void user_select_the_particular_data_then_the_dtata_should_be_deleted(String str) {
		 res = RestAssured.delete(str);
		
	   
	}
	@Then("User checks the status code {int}")
	public void user_checks_the_status_code(Integer int1) {
	    
		  validate = res.then();
		  validate.assertThat().statusCode(int1).log().all();
	    
	}
	     
	}

 



