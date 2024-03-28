package stepDefinitions;

import genericLibraries.IConstantPath;
import genericLibraries.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import objectRepo.CreateNewLeadPage;

public class CreateLeadPageSteps {
	TestContextSetUp testContext;
	CreateNewLeadPage createLead;

	public CreateLeadPageSteps(TestContextSetUp testContext) {
		this.testContext = testContext;
	}

	@And("^creates a new lead with (.*) and (.*)$")
	public void creates_a_new_lead(String name, String company) {
		createLead = testContext.pageObjects.getCreateLead();
		testContext.leadName = name;
		createLead.setLastName(name);
		createLead.setCompany(company);
		createLead.clickSave();
	}

	@When("creates a new lead with details")
	public void creates_a_new_lead_with_details() {
		createLead = testContext.pageObjects.getCreateLead();
		testContext.excel.excelInit(IConstantPath.EXCEL_PATH);
		testContext.map = testContext.excel.readFromExcel("Create and Duplicate Lead", 
																	"LeadsTestData");
		testContext.leadName = testContext.map.get("Last Name") + 
				testContext.jutil.generateRandomNum(100);

		createLead.setLastName(testContext.leadName);
		createLead.setCompany(testContext.map.get("Company"));
		createLead.clickSave();
	}
}
