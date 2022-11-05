package authenticationcons;
 import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BarerTokenCons {
	 @Test
	public void barermain() {
		 baseURI="https://api.github.com";
		JSONObject obj = new JSONObject();
		obj.put( "name", "PetConsultentCons2");
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		.then().log().all();
		
	}
	 
	 
 
}
