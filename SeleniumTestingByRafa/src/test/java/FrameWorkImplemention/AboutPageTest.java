package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import FrameWorkImplemention.CommonWorkTest_POL;

public class AboutPageTest {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/about");
		
		/*//social_icons
		CommonWorkTest_POL.twitter(driver).click();
		CommonWorkTest_POL.facebook(driver).click();
		CommonWorkTest_POL.instagram(driver).click(); */ 
		
	    Thread.sleep(2000);
	    
		//footer
		CommonWorkTest_POL.emailaddress(driver).sendKeys("abcd1234@gmail.com");
		Thread.sleep(2000);
		CommonWorkTest_POL.subscribe(driver).click();
	
}
}