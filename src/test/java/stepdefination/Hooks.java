package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void login() {
		System.out.println("Login to the hook");
	}
	@After
	public void logout() {
		System.out.println("Logout to the hook");
	}

}
