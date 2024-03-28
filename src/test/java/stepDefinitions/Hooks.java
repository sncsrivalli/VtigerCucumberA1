package stepDefinitions;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {
	TestContextSetUp testContext;
	
	public Hooks(TestContextSetUp testContext) {
		this.testContext = testContext;
	}
	
	@Before
	public void beforeScenario() {
		long time = Long.parseLong(testContext.property.readFromProperties("timeouts"));
		testContext.web.waitTillElementFound(time);
	}
	
	@AfterStep
	public void afterStep() {
		
	}
	
	@After
	public void afterScenario() {
		testContext.web.quitAllWindows();
	}

}
