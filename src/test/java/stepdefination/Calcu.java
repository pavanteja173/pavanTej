package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Calcu extends AbstractTestNGCucumberTests {
int a;int b; int c;
	
	@Given("User enter first digit {int}")
	public void user_enter_first_digit(Integer int1) {
		a=int1;
	    
	}

	@Given("User enter second digit {int}")
	public void user_enter_second_digit(Integer int2) {
		b=int2;
	  
	}

	@When("Add both digits")
	public void add_both_digits() {
		c=a+b;
	    
	}

	@Then("verify addition of two digits are {int}")
	public void verify_addition_of_two_digits_are(Integer intResult) {
		
	 if (c==intResult) {
		 System.out.println(intResult);
	 }
	 else {
		 System.out.println("addition is not"+intResult);
	 }
	}

}
