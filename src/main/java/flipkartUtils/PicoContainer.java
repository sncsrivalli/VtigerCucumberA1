package flipkartUtils;

import org.openqa.selenium.WebDriver;

import flipkartPOM.PageObjectManager;

public class PicoContainer {

	public WebDriver driver;
	public DriverUtility driverUtil;
	public FileUtility fileUtil;
	public String mobileName;
	
	public PageObjectManager pom;
	
	public PicoContainer() {
		driverUtil = new DriverUtility();
		fileUtil = new FileUtility();
		
		fileUtil.fileInit("./src/test/resources/testData/flipkartData.properties");
		
		driver = driverUtil.launchBrowser(fileUtil.readData("browser"));
		pom = new PageObjectManager(driver);
	}
	
}
