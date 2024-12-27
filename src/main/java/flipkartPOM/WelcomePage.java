package flipkartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(css = "input.Pke_EE")
	private WebElement searchTF;
	
	@FindBy(className = "_2iLD__")
	private WebElement searchBTN;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setDataInSearchTF(String data) {
		searchTF.sendKeys(data);
	}
	
	public void clickSearchBTN() {
		searchBTN.click();
	}
}
