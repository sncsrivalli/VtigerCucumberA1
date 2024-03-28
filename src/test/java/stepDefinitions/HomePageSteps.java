package stepDefinitions;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.HomePage;

public class HomePageSteps {
	TestContextSetUp testContext;
	HomePage home;
	
	public HomePageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@When("User navigates to leads page")
	public void user_navigates_to_leads_page() { 
		home = testContext.pageObjects.getHome();
		home.clickLeads();
	}
	
	@Then("User signs out of vtiger")
	public void user_signs_out_of_vtiger() {
	    home.signOutOfApp(testContext.web);
	}

}
