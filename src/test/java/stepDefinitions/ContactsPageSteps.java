package stepDefinitions;

import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepo.ContactsPage;

public class ContactsPageSteps {
	TestContextSetUp testContext;
	ContactsPage contacts;

	public ContactsPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@When("clicks on create contact button")
	public void clicks_on_create_contact_button() {
		contacts = testContext.pageObjects.getContacts();
		contacts.clickPlusButton();
	}

	@When("User deletes the newly created contact")
	public void user_deletes_the_newly_created_contact() {
		contacts.deleteContact(testContext.web, testContext.contactName);
		testContext.web.handleAlert("ok");
	}

	@Then("new contact should not be displayed in contacts list")
	public void new_contact_should_not_be_displayed_in_contacts_list() {
		System.out.println(contacts.searchContact(testContext.contactName));
	}
}
