package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObjects {

	
	public WebDriver driver;
	
	By searchItem=By.id("search-field");
	By searchText= By.cssSelector("tr td:nth-child(1)");
	
	public OfferPageObjects(WebDriver driver) {
		this.driver=driver;
	}


	public void searchItem(String item)
	{
		driver.findElement(searchItem).sendKeys(item);
	}
	
	public String getSearchItem()
	{
		return driver.findElement(searchText).getText();
	}
}
