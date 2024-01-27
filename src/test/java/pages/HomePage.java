package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search	= By.xpath("//input[@type=\"search\"]");
	By ProductName = By.xpath("//h4[@class=\"product-name\"]");
	By Increment = By.xpath("//a[@class=\"increment\"]");
	By AddtoCart = By.xpath("//button[text()='ADD TO CART']");	
	By CartItem = By.xpath("//a[@class=\"cart-icon\"]");
	By proceedtoCheck = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	
	
	
	
	public void searchName(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	
	public String getProductName()
	{
		 return driver.findElement(ProductName).getText();
	}
	
	
	public void AddItems(int n)
	{
		for(int i=0; i<n; i++) // here we have to give n-1
		{
			//here if we give 3 then it will show 4 items picked bcs we r clicking 3 times and already one item will be there in ui so total 1+3=4
			driver.findElement(Increment).click();
		}
		
	}

	
	public void AddToCart() throws InterruptedException
	{
		Thread.sleep(200);
		driver.findElement(AddtoCart).click();
	}
	
	
	public void ProceedsToCart() throws InterruptedException
	{
		driver.findElement(CartItem).click();
		driver.findElement(proceedtoCheck).click();
		Thread.sleep(500);
	}
	
}
