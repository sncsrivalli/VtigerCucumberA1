package stepDefinitions;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.LeadsPage;

public class LeadsPageSteps {
	TestContextSetUp testContext;
	LeadsPage leads;
	
	public LeadsPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@And("clicks on create lead button")
	public void clicks_on_create_lead_button() {
		leads = testContext.pageObjects.getLeads();
		leads.clickPlusButton();
	}

	@When("User deletes the newly created lead")
	public void user_deletes_the_newly_created_lead() {
		leads.deleteLead(testContext.web, testContext.leadName);
		testContext.web.handleAlert("ok");
	}

	@Then("new lead should not be displayed in leads list")
	public void new_lead_should_not_be_displayed_in_leads_list() {
		boolean isTrue = leads.searchLead(testContext.leadName);
		System.out.println(isTrue);
	}

}
