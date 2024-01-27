package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import BrowserUtils.BroswerUtils;
import io.cucumber.java.en.Then;
import pages.DealPage;

public class OfferDeal {
	public String OfferPageText; 
	BroswerUtils util;
	
	public OfferDeal(BroswerUtils util)
	{
		this.util=util;
	}

	
	//Here we have two steps that are performing in offer deal page so inorder to make it more structured format we have to make it in two different steps
	
	@Then("User type the same name in deal page and check with same short name {string}")
	public void user_type_the_same_name_in_deal_page_and_check_with_same_short_name(String ShortName) throws InterruptedException
	{
//		DealPage deal=new DealPage(util.driver); here using pageObject manaegr method
		DealPage deal=util.obj.getDealPage(util.driverManeger.driver);
//	    util.driver.findElement(By.xpath("//a[@href=\"#/offers\"]")).click();//here we are simplyfyng using method
		deal.clickDealpage();
	    Thread.sleep(300);
	    
	  //Here we are going to make this all steps as single function so that we can ealy re use this method in future a well for others
		util.common.pageChangeToDeal();
		
//		util.driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(ShortName);
		deal.productNameSearchInDeal(ShortName);
		Thread.sleep(300);
		
		
		OfferPageText = deal.productNameExctract();
				//util.driver.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
		System.out.println(OfferPageText);
		

		
		
	}
	
	@Then("Compare both offer and home page showing same texts or not")
	public void comparing()
	{
		Assert.assertEquals(util.HomePageText, OfferPageText);
		
	}
	
	//here is the method
	}
