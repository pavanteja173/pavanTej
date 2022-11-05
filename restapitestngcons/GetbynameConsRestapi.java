package restapitestngcons;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetbynameConsRestapi {
	@Test
	public void getnameme() {
		
		 baseURI="http://localhost:8080";
		 when()
		 .get("/consutants/name/Paa1")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
	}

}
