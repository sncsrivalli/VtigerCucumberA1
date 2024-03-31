package stepDefinitions;

import genericLibraries.IConstantPath;
import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.When;
import objectRepo.CreateNewContactPage;

public class CreateContactPageSteps {
	TestContextSetUp testContext;
	CreateNewContactPage createContact;

	public CreateContactPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@When("^creates a new contact with (.*)$")
	public void creates_a_new_contact_with_name(String name) {
		createContact = testContext.pageObjects.getCreateContact();
		testContext.contactName = name;
		createContact.setLastName(name);
		createContact.clickSave();
	}

	@When("creates a contact with existing organization")
	public void creates_a_contact_with_existing_organization() {
		createContact = testContext.pageObjects.getCreateContact();
		testContext.excel.excelInit(IConstantPath.EXCEL_PATH);
		testContext.map = testContext.excel.readFromExcel("Create Contact With Organization", "ContactsTestData");
		
		testContext.contactName = testContext.map.get("Last Name");
		
		createContact.setLastName(testContext.map.get("Last Name"));
		createContact.selectExistingOrg(testContext.web, testContext.map.get("Organization Name"));
		createContact.clickSave();
		testContext.excel.closeExcel();
	}
}
