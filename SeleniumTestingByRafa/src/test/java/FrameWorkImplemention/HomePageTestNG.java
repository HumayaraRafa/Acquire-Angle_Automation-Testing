package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTestNG {

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
		driver.get("https://acquireangel.com");
		
		/*//join now button
	    CommonWorkTest_POL.joinnow(driver).click();
	    
		//social_icons
		CommonWorkTest_POL.twitter(driver).click();
		CommonWorkTest_POL.facebook(driver).click();
		CommonWorkTest_POL.instagram(driver).click(); */
		
		//footer
		CommonWorkTest_POL.emailaddress(driver).sendKeys("abcd1234@gmail.com");
		Thread.sleep(2000);
		CommonWorkTest_POL.subscribe(driver).click(); 
	
}
	@AfterTest
		public void tearDown()
{
		//driver.close();

} 
	
	
}
