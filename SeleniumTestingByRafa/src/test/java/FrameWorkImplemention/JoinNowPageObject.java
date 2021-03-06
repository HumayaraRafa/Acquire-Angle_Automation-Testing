package FrameWorkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JoinNowPageObject {

private static WebElement element=null;
	
//chose account type
	public static WebElement seller(WebDriver driver)
	{
   element=driver.findElement(By.id("Seller"));
   return element;
  }
	public static WebElement buyer(WebDriver driver)
	{
   element=driver.findElement(By.id("Buyer"));
   return element;
  }
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	public static WebElement password(WebDriver driver)
	{
     element=driver.findElement(By.id("Password"));
     return element;
    }
	
	public static WebElement signup(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
     return element;
    }
	
	public static WebElement signin(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//a[@class='text-info']"));
     return element;
    }
	
	public static WebElement linkedin(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[normalize-space()='LinkedIn']"));
     return element;
    }
	
	
}
