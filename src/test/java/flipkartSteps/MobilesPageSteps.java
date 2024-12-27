package flipkartSteps;

import flipkartPOM.MobilesPage;
import flipkartUtils.PicoContainer;
import io.cucumber.java.en.And;

public class MobilesPageSteps {

	PicoContainer pc;
	
	public MobilesPageSteps(PicoContainer pico) {
		this.pc = pico;
	}
	
	@And("I click on a mobile")
	public void i_click_on_a_mobile() {
	    MobilesPage mobiles = pc.pom.getMobiles();
	    
	    pc.mobileName = mobiles.getFirstMobileText();
	    mobiles.clickFirstMobile();
	}
}
