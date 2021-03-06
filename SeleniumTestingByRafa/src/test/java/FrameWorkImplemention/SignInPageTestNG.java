package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPageTestNG {
	
private static WebDriver driver=null;
	
	@BeforeTest
		public void setUpTest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	@Test
		public void stepone() throws InterruptedException
	{
		driver.get("https://www.acquireangel.com/signin");
		
		//email
		//SELLER_mail_address
		//SignInPageObject.emailaddress(driver).sendKeys("aly1emqj9z@eposta.buzz");
		
		//BUYER_mail_address
		SignInPageObject.emailaddress(driver).sendKeys("gasebe5710@godpeed.com");
		
		//password 
		SignInPageObject.password(driver).sendKeys("5BRWBmMjCc55yPG");
		//SignInPageObject.password(driver).sendKeys("5BRWBmMjCc55yPG");
		
		//remember_me
		//SignInPageObject.rememberme(driver).click();
		
		//submit button
		SignInPageObject.signin(driver).click();
		
	  /*//forgot password
		SignInPageObject.forgotpassword(driver).click();
		SignInPageObject.forgotpasswordemail(driver).sendKeys("hrafa783@gmail.com");
		SignInPageObject.send(driver).click(); */
		
	} 

	@AfterTest
		public void tearDown()
{
		//driver.close();
	
} 

}
