package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import POM.PageObjectManager;

public class TestContextsetUp {
	
	//public WebDriver driver;
	public String actual_name;
	
	public PageObjectManager pom;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextsetUp() throws IOException
	{
		testBase=new TestBase();
		pom=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());
	}

}
