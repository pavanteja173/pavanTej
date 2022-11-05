package restapitestngcons;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostrestCons {
	@Test
	public void main() {
		JSONObject obj = new JSONObject();
		obj.put( "address", "bnredy");
		obj.put( "designation", "devip");
		obj.put("email", "shiv2@gmail.com");
		obj.put( "id", 34);
		obj.put( "name", "PPavanTej");
		obj.put("phone", "8428497878");
		obj.put(  "status","siuit");
		
	 given()
	 .contentType(ContentType.JSON)
	 .body(obj)
	 
	 .when()
	 .post("http://localhost:8080/consutants")
	 
	 .then()
	 .assertThat().statusCode(201)
	 .body( "data.name",equalTo("PPavanTej")).log().all();

	}

}
