package es.uniovi.asw.steps;

import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;

@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
@IntegrationTest
@WebAppConfiguration
public class FailSteps extends ParentSteps {

	public FailSteps() {
		super("/online?idEleccion=1");
	}

}
