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

public class PostCucuConsa {
	RequestSpecification req;
	Response res ;
	ValidatableResponse validat;
	
	@Given("user is able to post the data in json formate")
	public void user_is_able_to_post_the_data_in_json_formate() {
		JSONObject obj = new JSONObject();
		obj.put( "address", "India");
		obj.put( "designation", "pm");
		obj.put("email", "pavan898@gmail.com");
		obj.put( "id", 1);
		obj.put( "name", "Pavan1teja");
		obj.put("phone", "8498896792");
		obj.put(  "status","okka");
		  req = RestAssured.given();
		  req.body(obj);
		  req.contentType(ContentType.JSON);
	    
	}

	@When("user post the data by using an api is {string}")
	public void user_post_the_data_by_using_an_api_is(String stri) {
		  res = req.post(stri);
	    
	}

	@Then("user validates the post status code is {int}")
	public void user_validates_the_post_status_code_is(Integer int1) {
		validat = res.then();
		  validat.assertThat().statusCode(int1).log().all();
	    
	}


}
