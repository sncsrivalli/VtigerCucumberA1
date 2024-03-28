package objectRepo;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LoginPage login;
	public HomePage home;
	public CreateNewLeadPage createLead;
	public LeadsPage leads;
	public DuplicatingLeadPage duplicateLead;
	public NewLeadDetailsPage newLead;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLogin() {
		login = new LoginPage(driver);
		return login;
	}

	public HomePage getHome() {
		home = new HomePage(driver);
		return home;
	}

	public CreateNewLeadPage getCreateLead() {
		createLead = new CreateNewLeadPage(driver);
		return createLead;
	}

	public LeadsPage getLeads() {
		leads = new LeadsPage(driver);
		return leads;
	}

	public DuplicatingLeadPage getDuplicateLead() {
		duplicateLead = new DuplicatingLeadPage(driver);
		return duplicateLead;
	}

	public NewLeadDetailsPage getNewLead() {
		newLead = new NewLeadDetailsPage(driver);
		return newLead;
	}
}
