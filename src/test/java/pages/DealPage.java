package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealPage {
	
	public WebDriver driver;
	
	public DealPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By dealPageLink = By.xpath("//a[@href=\"#/offers\"]");
	By SearchInDeal = By.xpath("//input[@id=\"search-field\"]");
	By ProductName = By.xpath("//table//tr[1]//td[1]");
	
	public void clickDealpage()
	{
		driver.findElement(dealPageLink).click();
	}
	
	public void productNameSearchInDeal(String name)
	{
		driver.findElement(SearchInDeal).sendKeys(name);
	}
			
	public String productNameExctract()
	{
		return driver.findElement(ProductName).getText();
	}

}
