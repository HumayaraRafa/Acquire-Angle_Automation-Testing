package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import FrameWorkImplemention.CommonWorkTest_POL;

public class HomePageTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://acquireangel.com/");
		
		//join now button
	    CommonWorkTest_POL.joinnow(driver).click();
	    
		//social_icons
		CommonWorkTest_POL.twitter(driver).click();
		CommonWorkTest_POL.facebook(driver).click();
		CommonWorkTest_POL.instagram(driver).click();
		
		//footer
		CommonWorkTest_POL.emailaddress(driver).sendKeys("abcd1234@gmail.com");
		Thread.sleep(2000);
		CommonWorkTest_POL.subscribe(driver).click(); 
		
	}
}
