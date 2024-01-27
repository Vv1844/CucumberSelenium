package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BrowserUtils.BroswerUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class SearchProduct {
	
	

	public BroswerUtils util; //if didnt declare it outside then the scope of util instance variabe will only inside of the constructor
	
	public SearchProduct(BroswerUtils util)  //creating a constructor and taking the common file class and assigning to instance variable
	{
		this.util=util; // we are adding values to class variable 
	}
	@Given("User is on the home page")
	public void user_is_on_the_home_page() throws IOException {
		//instead of initializing browser here , we added everything in TestBase class
	    util.driverManeger.WebDriverManager();
	  
		
		//here in every first case this step will execute so driver property wiill be set initially
		util.driverManeger.driver.manage().window().maximize();
	}
	@When("User searches a product with short name {string} and extracted the text")
	public void user_searches_a_product_with_short_name_and_extracted_the_text(String Name) throws InterruptedException {
		//we are going to use page objects here
		
		HomePage page=util.obj.getHomePage(util.driverManeger.driver);
//		HomePage page = new HomePage(util.driver);
		
		page.searchName(Name);
		Thread.sleep(300);
		String homePageName= page.getProductName();
		
//		util.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(ShortName);
	  
//	  String homePageName= util.driver.findElement(By.xpath("//h4[@class=\"product-name\"]")).getText();
	  util.HomePageText= homePageName.split("-")[0].trim();
	  System.out.println(util.HomePageText);
	  
	  }
	
	@When("Added {int} times to cart and User proceeds to cart item")
	public void added_times_to_cart_and_user_proceeds_to_cart_item(Integer int1) throws IOException, InterruptedException {
		HomePage page=util.obj.getHomePage(util.driverManeger.WebDriverManager());
		
		//adding items to cart 
		page.AddItems(int1);
		page.AddToCart();
		page.ProceedsToCart();
		
		
	    
	}
	

}
