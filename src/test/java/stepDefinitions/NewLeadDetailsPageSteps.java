package stepDefinitions;

import org.testng.Assert;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.Then;
import objectRepo.NewLeadDetailsPage;

public class NewLeadDetailsPageSteps {
	TestContextSetUp testContext;
	NewLeadDetailsPage newLead;
	
	public NewLeadDetailsPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@Then("New lead should be created")
	public void new_lead_should_be_created() {
		newLead = testContext.pageObjects.getNewLead();
		Assert.assertTrue(newLead.getPageHeader().contains(testContext.leadName));
		newLead.clickLeadsLink();
	}

	@Then("New lead should be created and click on duplicate button")
	public void new_lead_should_be_created_and_click_on_duplicate_button() {
		newLead = testContext.pageObjects.getNewLead();
		Assert.assertTrue(newLead.getPageHeader().contains(testContext.leadName));
		newLead.clickDuplicate();
	}
	
	@Then("duplicated lead should be created")
	public void duplicated_lead_should_be_created() {
		Assert.assertTrue(newLead.getPageHeader().contains(testContext.duplicateLeadName));
		newLead.clickLeadsLink();
	}
}
