package flipkartSteps;

import org.testng.Assert;

import flipkartUtils.PicoContainer;
import io.cucumber.java.en.Then;

public class CartPageSteps {

	PicoContainer pc;

	public CartPageSteps(PicoContainer pico) {
		this.pc = pico;
	}
	
	@Then("Mobile should be added to cart")
	public void mobile_should_be_added_to_cart() {
	    String actualTitle = pc.pom.getCart().getProductTitle();
	    Assert.assertTrue(actualTitle.equalsIgnoreCase(pc.mobileName));
	}
	
}
