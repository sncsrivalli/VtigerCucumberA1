package flipkartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstMobilePage {

	@FindBy(css = "svg.KRzcNw")
	private WebElement cartImage;
	
	public FirstMobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCartImage() {
		cartImage.click();
	}
}
