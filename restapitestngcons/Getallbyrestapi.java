package restapitestngcons;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

 

public class Getallbyrestapi {
	 @Test
	
	public void mainget() {
		baseURI="http://localhost:8080";
		 
		 when()
		 .get("/consutants")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .header( "Transfer-Encoding", "chunked")
		 .log().all();

	}


}
