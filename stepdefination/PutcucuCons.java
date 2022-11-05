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

public class PutcucuCons {
	RequestSpecification req;
	 Response res;
	 ValidatableResponse validat;
	
	@Given("user is able to put the data in database")
	public void user_is_able_to_put_the_data_in_database() {
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

	@When("user put the data by using  api is {string}")
	public void user_put_the_data_by_using_api_is(String stri) {
		  res = req.post(stri);
	    
	}

	@Then("user validates the put status code  {int}")
	public void user_validates_the_put_status_code(Integer int1) {
		validat = res.then();
		  validat.assertThat().statusCode(int1).log().all();
	   
	}


}
