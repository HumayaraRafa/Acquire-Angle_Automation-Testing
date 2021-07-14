package FrameWorkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonWorkTest_POL {

private static WebElement element=null;
	
	public static WebElement joinnow(WebDriver driver)
	{
     element=driver.findElement(By.linkText("Join Now"));
     return element;
     
    }
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//input[@type='text']"));
     return element;
     
    }
	
	public static WebElement subscribe(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//input[@type='submit']"));
     return element;
     
    }
	
	
	public static WebElement twitter(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//span[@class='icon-twitter']"));
     return element;
     
	}
	
	public static WebElement facebook(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//span[@class='icon-facebook']"));
     return element;
     
	}
	
	public static WebElement instagram(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//span[@class='icon-instagram']"));
     return element;
     
	}
	
	
	
	
	
}
