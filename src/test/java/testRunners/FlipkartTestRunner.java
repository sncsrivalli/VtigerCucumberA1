package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/featureFiles",
				glue = "flipkartSteps",
				tags = "@flipkart",
				plugin = {"pretty",
						"html:test-output/HTML/fpReport.html",
						"json:test-output/JSON/fpReport.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class FlipkartTestRunner extends AbstractTestNGCucumberTests{

	
}
