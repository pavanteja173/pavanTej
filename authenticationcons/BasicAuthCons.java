package authenticationcons;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

 
public class BasicAuthCons {
	@Test

	public void basicmain() {
		
		 baseURI="https://github.com/";
		 
		 given().auth().basic("pavanteja173", "Pavan@988")
		 .when().get("/login").then().log().all();

	}

}
