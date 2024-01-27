package BrowserUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.PageObjectManeger;

public class BroswerUtils {

	//Here we will store all the common variables and methods
	public WebDriver driver;
    public String HomePageText;
    public PageObjectManeger obj;
    public TestBase driverManeger;
    public Generic common;
    
    
   public BroswerUtils() throws IOException
   {
	   driverManeger = new TestBase();
	   obj = new PageObjectManeger(driverManeger.WebDriverManager());
	   
	  common = new Generic(driverManeger.WebDriverManager());
   }
    
    
   
    
    
    
}
