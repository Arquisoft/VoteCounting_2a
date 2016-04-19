package es.uniovi.asw.steps;

import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.java.en.Then;
import es.uniovi.asw.Application;

@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
@IntegrationTest
@WebAppConfiguration
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
