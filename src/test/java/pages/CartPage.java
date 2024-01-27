package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {
	public WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
		By TextinCart = By.xpath("//table//tbody//tr[1]//td[2]");
		By PromoCodeInput = By.xpath("//input[@placeholder=\"Enter promo code\"]");
		By PlaceOrderButton= By.xpath("//button[text()=\"Place Order\"]");
		
		
		
		public String getElementTextFromCart()
		{
			return driver.findElement(TextinCart).getText();
		}
		
		public void VerifyPromocodeAndPlaceOrderButtonDislayed()
		{
//			driver.findElement(PromoCodeInput).isDisplayed();
//			driver.findElement(PlaceOrderButton).isDisplayed();
			Assert.assertTrue(driver.findElement(PromoCodeInput).isDisplayed());
			Assert.assertTrue(driver.findElement(PlaceOrderButton).isDisplayed());
		}
			

}
