package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManeger {
	
	public DealPage deals;
	public HomePage home;
	public CartPage cart;

	public WebDriver driver;
	
	public PageObjectManeger(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public DealPage getDealPage(WebDriver driver)
	{
		deals= new DealPage(driver);
		return deals;
	}
	
	public HomePage getHomePage(WebDriver driver)
	{
		home= new HomePage(driver);
		return home;
	}
	
	public CartPage getCartPage()
	{
		cart = new CartPage(driver);
		
		return cart;
		
	}
}


