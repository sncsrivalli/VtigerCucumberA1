package stepDefinitions;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.And;
import objectRepo.DuplicatingLeadPage;

public class DuplicateLeadPageSteps {
	TestContextSetUp testContext;
	DuplicatingLeadPage duplicateLead;

	public DuplicateLeadPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@And("User duplicates the new lead")
	public void user_duplicates_the_new_lead() {
		duplicateLead = testContext.pageObjects.getDuplicateLead();
		testContext.duplicateLeadName = testContext.map.get("New Last Name") + testContext.jutil.generateRandomNum(100);
		duplicateLead.setNewLastName(testContext.duplicateLeadName);
		duplicateLead.clickSave();
	}
}
