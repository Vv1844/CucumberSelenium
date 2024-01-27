package stepDefinitions;

import org.testng.Assert;

import BrowserUtils.BroswerUtils;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartPageStep {
	public BroswerUtils util; //if didnt declare it outside then the scope of util instance variabe will only inside of the constructor
	public CartPage cart;
	
	public CartPageStep(BroswerUtils util)  //creating a constructor and taking the common file class and assigning to instance variable
	{
		this.util=util; // we are adding values to class variable 
		cart = util.obj.getCartPage(); //for having a common page creation add this items in constructor itself
	}
	
	 
	@Then("Validating that user have option to entry promo code and place order")
	public void validating_that_user_have_option_to_entry_promo_code_and_place_order() throws InterruptedException {
//		CartPage cart = util.obj.getCartPage();
		Thread.sleep(300);
		String cartPage=cart.getElementTextFromCart().split("-")[0].trim();
		Assert.assertEquals(util.HomePageText,cartPage);
	}
	
	@Then("validating that {string} in the cart are same that we ordered")
	public void validating_that_in_the_cart_are_same_that_we_ordered(String string) {
//		CartPage cart = util.obj.getCartPage();
	    cart.VerifyPromocodeAndPlaceOrderButtonDislayed();
	}


}
