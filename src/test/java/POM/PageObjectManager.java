package POM;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	
	public HomePageObjects hpo;
	public OfferPageObjects opo;
	public CheckOutPage cop;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePageObjects getHomePage()
	{
		hpo=new HomePageObjects(driver);
		return hpo;
	}
	
	public OfferPageObjects getOfferPage()
	{
		opo=new OfferPageObjects(driver);
		return opo;
	}
	
	public CheckOutPage getCheckOutPage()
	{
		cop=new CheckOutPage(driver);
		return cop;
	}
}
