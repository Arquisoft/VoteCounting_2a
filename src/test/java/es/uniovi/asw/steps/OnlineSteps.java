package es.uniovi.asw.steps;

import cucumber.api.java.en.Then;


public class OnlineSteps extends ParentSteps {

	public OnlineSteps() {
		super("/foo");
	}

	@Override
	@Then("^the client receives the string \"([^\"]*)\"$")
	public void the_client_receives_the_string(String str) throws Throwable {
		// no aplica
	}
}
