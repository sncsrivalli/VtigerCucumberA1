package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	public void afterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] byteArray = null;
			File file = testContext.web.captureScreenshot(testContext.driver, 
					testContext.jutil, scenario.getName());
			try {
				byteArray = FileUtils.readFileToByteArray(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			scenario.attach(byteArray, "image/png", "failed_step");
		}
	}
	
	@After
	public void afterScenario() {
		testContext.web.quitAllWindows();
	}

}
