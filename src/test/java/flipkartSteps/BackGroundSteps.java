package flipkartSteps;

import flipkartUtils.PicoContainer;
import io.cucumber.java.en.Given;

public class BackGroundSteps {

	PicoContainer pc;

	public BackGroundSteps(PicoContainer pico) {
		this.pc = pico;
	}
	
	@Given("I navigate to flipkart")
	public void i_navigate_to_flipkart() {
	    pc.driverUtil.navigateToApp(pc.fileUtil.readData("url"));
	}
}
