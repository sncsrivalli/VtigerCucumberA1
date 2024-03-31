package objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class ContactsPage {

	// Declaration
	@FindBy(xpath = "//a[@class='hdrLink']")
	private WebElement pageHeader;

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement plusButton;

	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[last()]/td[4]/a")
	private WebElement newContactLink;

	private String contactCheckboxPath = "//a[text()='%s']/parent::td/preceding-sibling::td/child::input[@name]";
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr/td[4]/a")
	private List<WebElement> contactNamesList;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	// Initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}

	public void clickPlusButton() {
		plusButton.click();
	}

	public String getNewContactName() {
		return newContactLink.getText();
	}
	
	public boolean searchContact(String lastName) {
		boolean status = false;
		for (WebElement name : contactNamesList) {
			if(name.getText().equals(lastName)) {
				status = true;
				break;
			}				
		}
		return status;
	}
	
	public void deleteContact(WebDriverUtility web, String lastName) {
		web.convertPathToWebElement(contactCheckboxPath, lastName).click();
		deleteButton.click();
	}
}
