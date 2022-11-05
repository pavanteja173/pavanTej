package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteIdConsCucu {
	
	 Response res;
	  ValidatableResponse validate;
@When("User is able to delete the id by using an api is {string}")
public void user_is_able_to_delete_the_id_by_using_an_api_is(String url) {
	
	 res = RestAssured.get(url);
}

@Then("User validate the delete status code of id is {int}")
public void user_validate_the_delete_status_code_of_id_is(Integer int1) {
	validate = res.then();
	  validate.assertThat().statusCode(int1).log().all();
  
    
}


}
