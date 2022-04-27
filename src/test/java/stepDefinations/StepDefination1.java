package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.HomePageObjects;
import POM.PageObjectManager;
import Utils.TestBase;
import Utils.TestContextsetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination1 {

	//public WebDriver driver;
	//public String actual_name;
	//public String available_product;
	TestContextsetUp testcontextSetup;
	//
	
	public StepDefination1(TestContextsetUp testcontextSetup)
	{
		this.testcontextSetup=testcontextSetup;
		this.hpj=testcontextSetup.pom.getHomePage();
	}
	public HomePageObjects hpj;
	//public PageObjectManager pm;
	
	
@Given("User is on Greenkart homepage")
public void user_is_on_greenkart_homepage() throws InterruptedException {
	
	
	
}
@When("^user searched with shortname (.+) and extracted the actual item name$")
public void user_searched_with_shortname_and_extracted_the_actual_item_name(String shortname) throws InterruptedException {
	
	
	//pm=new PageObjectManager(testcontextSetup.driver);
	//hpj=pm.getHomePage();
	hpj.hm_searchBox(shortname);
    Thread.sleep(7000);
    testcontextSetup.actual_name=hpj.product_text();
}



@When("added {string}  items of the selected product to cart")
public void added_items_of_the_selected_product_to_cart(String items) {
hpj.increment(Integer.parseInt(items));
	
	hpj.addToCart();
}


}
