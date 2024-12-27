package flipkartPOM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public WelcomePage getWelcome() {
		return new WelcomePage(driver);
	}

	public MobilesPage getMobiles() {
		return new MobilesPage(driver);
	}

	public FirstMobilePage getFirstMobile() {
		return new FirstMobilePage(driver);
	}

	public CartPage getCart() {
		return new CartPage(driver);
	}
	
}
