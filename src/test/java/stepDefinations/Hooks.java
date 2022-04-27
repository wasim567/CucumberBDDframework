package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextsetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContextsetUp testContextsetUp;
	
	public Hooks(TestContextsetUp testContextsetUp)
	{
		this.testContextsetUp=testContextsetUp;
	}
	
	@After
	public void afterScenario() throws IOException {
		testContextsetUp.testBase.WebDriverManager().quit();
	}
	
	
	@AfterStep
	public void getScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver=testContextsetUp.testBase.WebDriverManager();
		
		if(scenario.isFailed())
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] file_content=FileUtils.readFileToByteArray(src);
			scenario.attach(file_content, "image/png", "image");
		}
	}
}
