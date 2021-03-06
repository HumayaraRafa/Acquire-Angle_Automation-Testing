package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import FrameWorkImplemention.JoinNowPageObject;

public class JoinNowPageTest {

public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
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
}
