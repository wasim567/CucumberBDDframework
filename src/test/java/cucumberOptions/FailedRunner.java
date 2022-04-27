package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenarios.txt", glue="stepDefinations", monochrome=true,tags="@ValidateResult or @PlaceOrder",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"})

public class FailedRunner extends AbstractTestNGCucumberTests{

	
	 
}
