package BrowserUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic {
	//here we will store all the common steps that we gonna use in framework
	public WebDriver driver;
	
	public Generic(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void pageChangeToDeal()
    {
		Set<String> ids= driver.getWindowHandles();
//		for(String i:ids)
//		{
//			System.out.println(i); //if we have multiple widnows use this method or elese convert it to list
//		}
//		
		
		List<String> idList= new ArrayList(ids);

		String id= idList.get(1);
		driver.switchTo().window(id);
    }


}
