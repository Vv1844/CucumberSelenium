package BrowserUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase  {
	
	public WebDriver driver;
	
	
	public TestBase() {
		// TODO Auto-generated constructor stub
	}	

	public WebDriver WebDriverManager() throws IOException
	{
		//Here we r adding all the system.out property /Other wise we need to add these steps in @given case it will increase the complecity .
		// We have to make all the step definition more readable like english
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties"); //his it to make the global file readable
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("Url");
		
		String browser_java = prop.getProperty("Browser");
		String browser_maven =  System.getProperty("Browser"); //by giving system.get we can give value from cmd
		
		String Browser = (browser_maven!=null)? browser_maven : browser_java;
		
//		String Browser = prop.getProperty("Browser");
		if(driver==null) //if driver already invoked then no need to invoke another driver again
		{
            if(Browser.equalsIgnoreCase("Chrome"))
            {
            	driver = new ChromeDriver();
    			System.setProperty("webdriver.http.factory", "jdk-http-client");
    			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\OWNER\\\\Desktop\\\\SELENIUM\\\\chromedriver.exe");	
    			driver.get(URL);
            }
            else if(Browser.equalsIgnoreCase("edge"))
            {
            	//write code for another browser as well
            }
		}
		
		return driver;

	}

}
