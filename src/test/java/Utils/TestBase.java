package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);		
		String url=prop.getProperty("url");
		
		String browser_properties=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		String browser=browser_maven!=null?browser_maven:browser_properties;
		if(driver==null) {
			
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\Resources\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		}
		
		
		return driver;
		
	}

}
