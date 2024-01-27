package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinitions",
		monochrome=true , 
		tags="@cart",
		plugin= {"pretty","html:target/cucumber-report/cucumber.html", 
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/Failed_TestScenario.txt"}
		)

public class TestNGRunner extends AbstractTestNGCucumberTests{

	//making steps running parallely
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	} 
}
