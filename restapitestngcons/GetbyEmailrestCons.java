package restapitestngcons;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetbyEmailrestCons {
	
	@Test
	public void main() {
		 
				 baseURI="http://localhost:8080";
				 when()
				 .get("/consutants/email/pavan8@gmail.com")
				 
				 .then()
				 .assertThat().statusCode(200)
				 .log().all();

	}

}
