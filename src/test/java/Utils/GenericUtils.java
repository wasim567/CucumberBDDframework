package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void switchWindowToChild() {
	 Set<String> windows=driver.getWindowHandles();
	    Iterator<String> itr=windows.iterator();
	    String parent= itr.next();
	    String child=itr.next();
	    driver.switchTo().window(child);
	}
}
