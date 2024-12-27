package flipkartSteps;

import flipkartUtils.PicoContainer;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	PicoContainer pc;
	
	public Hooks(PicoContainer pico) {
		this.pc = pico;
	}
	
	@Before("@flipkart")
	public void beforeScenario() {
		pc.driverUtil.maximizeBrowser();
		
		long time = Long.parseLong(pc.fileUtil.readData("timeouts"));
		pc.driverUtil.waitTillElementFound(time);
	}
	
	@After("@flipkart")
	public void afterScenario() {
		pc.driverUtil.quitWindows();
	}
}
