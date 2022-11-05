package restapitestngcons;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutrestCons {
	@Test
	public void mainnn() {
	   JSONObject obj = new JSONObject();
		obj.put( "address", "jogulambagadwal");
		obj.put( "designation", "cm");
		obj.put("email", "vasanth12@gmail.com");
		obj.put( "id", 53);
		obj.put( "name", "vasanthkumarrr");
		obj.put("phone", "8428896896");
		obj.put(  "status","sss");
		
	 given()
	 .contentType(ContentType.JSON)
	 .body(obj)
	 
	 .when()
	 .post("http://localhost:8080/consutants")
	 
	 .then()
	 .assertThat().statusCode(201)
	 .assertThat().log().all();

	}

}
