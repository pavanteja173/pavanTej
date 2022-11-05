package restapitestngcons;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetbyIdapiCons {
	@Test
	 public void main() {
	 baseURI="http://localhost:8080";
	 
	 when()
	 .get("/consutants/id/75")
	 
	 .then()
	 .assertThat().statusCode(200)
	 .log().all();

}

}
