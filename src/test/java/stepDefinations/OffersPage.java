package stepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import POM.HomePageObjects;
import POM.OfferPageObjects;
import Utils.TestContextsetUp;
import io.cucumber.java.en.Then;

public class OffersPage {

	TestContextsetUp testcontextSetup;
	public String available_product;
	public OfferPageObjects opj;
	public HomePageObjects hpj;
	public OffersPage(TestContextsetUp testcontextSetup)
	{
		this.testcontextSetup=testcontextSetup;
		 this.opj=testcontextSetup.pom.getOfferPage();
		 this.hpj=testcontextSetup.pom.getHomePage();
	}

	
	@Then("^user searched for the same short name (.+) in offerspage$")
	public void user_searched_for_the_same_short_name_in_offerspage(String shortName) throws InterruptedException, IOException {
		switchToOffersPage();
       
         opj.searchItem(shortName);
	    Thread.sleep(3000);
	    available_product=opj.getSearchItem();
	}
	
	public void switchToOffersPage() throws InterruptedException, IOException
	{
		
		
		if(!(testcontextSetup.testBase.WebDriverManager().getTitle().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")))
		{
		
		hpj.click_TopDealsLink();
	    Thread.sleep(3000);
	    testcontextSetup.genericUtils.switchWindowToChild();
		}
	}

	
	
	@Then("validate the product name in offers page matches with actual item name inLanding page")
	public void validate_the_product_name_in_offers_page_matches_with_actual_item_name_in_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(available_product, testcontextSetup.actual_name);
		   
		   System.out.println("Hello Demo");
	}
}
