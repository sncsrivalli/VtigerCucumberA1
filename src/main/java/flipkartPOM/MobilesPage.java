package flipkartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilesPage {

	@FindBy(xpath = "(//div[@class='KzDlHZ'])[1]")
	private WebElement firstMobileLink;
	
	@FindBy(css = ".GAbRIN")
	private WebElement cartWidget;
	
	public MobilesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFirstMobile() {
		firstMobileLink.click();
	}
	
	public String getFirstMobileText() {
		return firstMobileLink.getText();
	}
	
	public void clickCartWidget() {
		cartWidget.click();
	}
}
