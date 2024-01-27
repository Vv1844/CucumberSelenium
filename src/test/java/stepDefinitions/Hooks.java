package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import BrowserUtils.BroswerUtils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	BroswerUtils utils;
	
	public Hooks(BroswerUtils utils)
	{
		this.utils = utils;
	}
	
	@After
	public void browserInvoke() throws IOException
	{
		//here we RE GOING TO CLOSE THE broser , and the browser is in test base class and the object is declared already in util
		
		utils.driverManeger.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver= utils.driverManeger.WebDriverManager();
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
	
		
	}
}
