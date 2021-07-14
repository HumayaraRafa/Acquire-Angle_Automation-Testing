package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SigninPage {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/signin");
				
		/*//Page title capture
	    System.out.println("Title of the page:  "+driver.getTitle());
			
		//current URL capture
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
			
		//Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource());
		
		//new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		
		//open another URL
		driver.navigate().to("https://www.acquireangel.com/signup");
		
		//back to home page
		driver.findElement(By.linkText("acquireangel")).click(); */
		
//sign in fill up field valid info
		driver.findElement(By.id("Email")).sendKeys("qwer1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd1234");
		//driver.findElement(By.id("IsRemember")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		//Forgot Password Button
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		driver.findElement(By.id("Email")).sendKeys("qwer123@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//LinkedIn
		//driver.findElement(By.id("ExternalLogin")).click();
		
/*//sign in fill up field invalid info
		driver.findElement(By.id("Email")).sendKeys("qwer123@gmailcom");
		driver.findElement(By.id("Password")).sendKeys("     ");
		//driver.findElement(By.id("IsRemember")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		//Forgot Password Button
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		driver.findElement(By.id("Email")).sendKeys("qwer123@gmailcom");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		//signup button 
		driver.findElement(By.xpath("//a[@class='text-info']")).click();
	
		//tab close
		driver.close();
	}


}
