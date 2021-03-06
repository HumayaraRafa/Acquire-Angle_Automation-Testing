package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import FrameWorkImplemention.SignInPageObject;

public class SignInPageTest {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/signin");
		
	//filled all fields with valid info
		SignInPageObject.emailaddress(driver).sendKeys("aly1emqj9z@eposta.buzz");
		SignInPageObject.password(driver).sendKeys("5BRWBmMjCc55yPG");
		
	//filled all fields with invalid info
		//SignInPageObject.emailaddress(driver).sendKeys("aly1emqj9z@eposta  buzz");
		//SignInPageObject.password(driver).sendKeys("        ");
		
		SignInPageObject.send(driver).click();
		//SignInPageObject.rememberme(driver).click();
		//SignInPageObject.signin(driver).click(); 
		
  /*//forgot_password
		SignInPageObject.forgotpassword(driver).click();
		SignInPageObject.emailaddress(driver).sendKeys("hrafa783@gmail.com");
		
   //social_link
		SignInPageObject.linkedIn(driver).click();
		SignInPageObject.signup(driver).click();*/
		
}
}
