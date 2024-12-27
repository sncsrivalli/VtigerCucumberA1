package flipkartUtils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtility {

	WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		switch(browser) {
		case "chrome": 
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser data");
		}
		
		return driver;
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void navigateToApp(String url) {
		driver.get(url);
	}
	
	public void waitTillElementFound(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void switchToWindow(String expectedTitle) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getTitle().contains(expectedTitle))
				break;
		}
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void quitWindows() {
		driver.quit();
	}
}
