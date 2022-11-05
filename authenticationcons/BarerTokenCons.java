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
		obj.put( "name", "petgit12");
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		.then().log().all();
		
	}
	 
	 
 
}
