package genericLibraries;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import objectRepo.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public PropertiesUtility property;
	public ExcelUtility excel;
	public JavaUtility jutil;
	public WebDriverUtility web;
	
	public PageObjectManager pageObjects;
	
	public String leadName;
	public Map<String, String> map;
	public String duplicateLeadName;
	
	public TestContextSetUp() {
		property = new PropertiesUtility();
		web = new WebDriverUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		driver = web.launchBrowserAndMaximize(property.readFromProperties("browser"));
		
		pageObjects = new PageObjectManager(driver);
	}
}
