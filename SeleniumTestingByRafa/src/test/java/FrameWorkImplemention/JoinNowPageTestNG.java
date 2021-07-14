package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JoinNowPageTestNG {
	
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
		//URL visit
		driver.get("https://acquireangel.com/signup");
				
		//account type choose
		JoinNowPageObject.seller(driver).click();
		//JoinNowPageObject.buyer(driver).click();
				
	    //filled all fields with valid info
	    JoinNowPageObject.emailaddress(driver).sendKeys("eqsxw1l9zr@email.edu.pl");
		JoinNowPageObject.password(driver).sendKeys("zxcvbnm");
		JoinNowPageObject.signup(driver).click(); 
				
		/* //invalid info
		JoinNowPageObject.emailaddress(driver).sendKeys("eqsxw1l9zr@email  edu.pl");
		JoinNowPageObject.password(driver).sendKeys("          ");
		JoinNowPageObject.signup(driver).click(); */
				
		//JoinNowPageObject.signin(driver).click();
		//JoinNowPageObject.linkedin(driver).click();
	
	}
	
	@AfterTest
	public void tearDown()
{
	//driver.close();

} 
}
