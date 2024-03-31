package stepDefinitions;

import org.testng.Assert;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.Then;
import objectRepo.NewContactDetailsPage;

public class NewContactDetailsPageSteps {
	TestContextSetUp testContext;
	NewContactDetailsPage newContact;
	
	public NewContactDetailsPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}
	@Then("New contact should be created")
	public void new_contact_should_be_created() {
		newContact = testContext.pageObjects.getNewContact();
		Assert.assertTrue(newContact.getPageHeader().contains(testContext.contactName));
		newContact.clickContactsLink();
	}

}
