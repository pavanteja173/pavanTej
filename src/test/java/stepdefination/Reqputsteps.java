package stepdefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Reqputsteps {
	RequestSpecification req;
	Response res;
	   ValidatableResponse validate;
	
	@Given("User wants to provide the data")
	public void user_wants_to_provide_the_data() {
		  req = RestAssured.given();
		JSONObject obj = new JSONObject();
	     obj.put("name", "pavan teja");
	     obj.put( "job", "analyst");
	     
	     req.body(obj).contentType(ContentType.JSON);
	     
	}

	@When("User put the data using the api is {string}")
	public void user_put_the_data_using_the_api_is(String url) {
		 res = req.put(url);
	 
	}

	@Then("User checks the status line will be {string}")
	public void user_checks_the_status_line_will_be(String status) {
		   validate = res.then();
		   validate.assertThat().statusLine(status);
	    
	}

	@Then("User checks the status code is whether {int}")
	public void user_checks_the_status_code_is_whether(Integer code) {
		validate.statusCode( code);
		validate.log().all();
	    
	}


}
