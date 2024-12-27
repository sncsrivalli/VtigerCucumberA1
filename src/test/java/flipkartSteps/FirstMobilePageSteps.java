package flipkartSteps;

import flipkartUtils.PicoContainer;
import io.cucumber.java.en.And;

public class FirstMobilePageSteps {

	PicoContainer pc;

	public FirstMobilePageSteps(PicoContainer pico) {
		this.pc = pico;
	}
	
	@And("I click on cart symbol")
	public void i_click_on_cart_symbol() throws InterruptedException {
	    pc.driverUtil.switchToWindow(pc.mobileName);
	    pc.pom.getFirstMobile().clickCartImage();
	    Thread.sleep(2000);
	}
}
