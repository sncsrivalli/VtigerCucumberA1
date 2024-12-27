package flipkartSteps;

import flipkartPOM.WelcomePage;
import flipkartUtils.PicoContainer;
import io.cucumber.java.en.When;

public class WelcomePageSteps {

	PicoContainer pc;
	
	public WelcomePageSteps(PicoContainer pico) {
		this.pc = pico;
	}
	
	@When("I search for mobiles")
	public void i_search_for_mobiles() {
	    WelcomePage welcome = pc.pom.getWelcome();
	    
	    welcome.setDataInSearchTF(pc.fileUtil.readData("search_item"));
	    welcome.clickSearchBTN();
	}
}
