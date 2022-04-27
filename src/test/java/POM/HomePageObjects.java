package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {

	 public WebDriver driver;
	 
	 public HomePageObjects(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	By hm_searchbox= By.xpath("//input[@type='search']");
	By hm_ptext= By.xpath("//h4[@class='product-name']");
	By top_link= By.linkText("Top Deals");
	By Increment=By.cssSelector("a.increment");
	By cart=By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public void hm_searchBox(String search_text)
	{
		driver.findElement(hm_searchbox).sendKeys(search_text);
	}
	
	public String product_text()
	{
		return driver.findElement(hm_ptext).getText().split("-")[0].trim();
	}
	
	public void click_TopDealsLink()
	{
		driver.findElement(top_link).click();
	}
	
	public void increment(int count)
	{
		int i=count-1; 
		while(i>0)
		{
			driver.findElement(Increment).click();
			i--;
		}
		
	}
	
	public void addToCart() {
		driver.findElement(cart).click();
	}
}
