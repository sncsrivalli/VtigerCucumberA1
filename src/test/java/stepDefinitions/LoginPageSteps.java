package stepDefinitions;

import org.testng.Assert;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import objectRepo.LoginPage;

public class LoginPageSteps {
	TestContextSetUp testContext;
	LoginPage login;
	
	public LoginPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@Given("User navigates to Vtiger CRM")
	public void user_navigates_to_vtiger_crm() {
		testContext.web.navigateToApp(testContext.property.readFromProperties("url"));
		Assert.assertEquals(login.getPageHeader(), "vtiger");
	}

	@And("User logs in into vtiger")
	public void user_logs_in_into_vtiger() {
		login = testContext.pageObjects.getLogin();
		login.loginToVtiger(testContext.property.readFromProperties("username"),
				testContext.property.readFromProperties("password"));
	}
}
