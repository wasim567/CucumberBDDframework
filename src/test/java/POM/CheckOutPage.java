package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public WebDriver driver;
	
	public CheckOutPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By bag=By.cssSelector("[alt='Cart']");
	By proceedbtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By product=By.cssSelector("p.product-name");
	By promoBtn=By.cssSelector(".promoBtn");
	By place_order=By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	
	
	
	public void checkOut()
	{
		driver.findElement(bag).click();
		driver.findElement(proceedbtn).click();		
	}
	
	public String product_Name()
	{
		return driver.findElement(product).getText().split("-")[0].trim();
	}
	
	public boolean promoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean placeOrder()
	{
		return driver.findElement(place_order).isDisplayed();
	}
}
