package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/featureFiles",
				glue = "stepDefinitions", monochrome = true,
				plugin = {"pretty",
						"html:target/HTML/report.html",
						"json:target/JSON/report.json"
				})
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
