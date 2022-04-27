package stepDefinations;

import org.testng.Assert;

import POM.CheckOutPage;
import Utils.TestContextsetUp;
import io.cucumber.java.en.Then;

public class CheckOutStepDefination {

	TestContextsetUp testContextsetup;
	public CheckOutPage checkoutpage;
	
	public CheckOutStepDefination (TestContextsetUp testContextsetup)
	{
		this.testContextsetup=testContextsetup;
		this.checkoutpage=testContextsetup.pom.getCheckOutPage();
	}
	
	
	
	
	@Then("^user proceeds to checkout page and validate the (.+) item in checkout page$")
	public void  user_proceeds_to_checkout_page_and_validate_the_item_in_checkout_page(String item)
	
	{
		checkoutpage.checkOut();
		Assert.assertTrue(checkoutpage.product_Name().contains("Tom"));
		
	}
	
	
	
	@Then("verify user has ability to enter promocode and place the order")
	public void verify_user_has_ability_to_enter_promocode_and_place_the_order()
	{
		Assert.assertTrue(checkoutpage.promoBtn());
		Assert.assertTrue(checkoutpage.placeOrder());
	}
	
}
