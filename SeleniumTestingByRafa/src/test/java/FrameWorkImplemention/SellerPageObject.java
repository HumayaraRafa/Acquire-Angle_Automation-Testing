package FrameWorkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerPageObject {
		
		private static WebElement element=null;
		
		public static WebElement joinnow(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[@class='btn btn-primary px-4 py-3 mt-3']"));
	     return element;
	    }
		
}
