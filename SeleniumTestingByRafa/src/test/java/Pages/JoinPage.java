package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JoinPage {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/signup");
				
		/*//Page title capture
	    System.out.println("Title of the page:  "+driver.getTitle());
			
		//current URL capture
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
			
		//Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource());
		
		Thread.sleep(3000);
		
		//new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		
		//open another URL
		driver.navigate().to("https://www.acquireangel.com/");*/
		
		//chose account type
		driver.findElement(By.id("Seller")).click();
		//driver.findElement(By.id("Buyer")).click();
		
		//with valid info
		driver.findElement(By.id("Email")).sendKeys("eqsxw1l9zr@email.edu.pl");
		driver.findElement(By.id("Password")).sendKeys("zxcvbnm");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		/* //with invalid info
		driver.findElement(By.id("Email")).sendKeys("eqsxw1l9zr@email   edpl");
		driver.findElement(By.id("Password")).sendKeys("        ");
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
		//back to home page
		//driver.findElement(By.linkText("acquireangel")).click();
				
		//tab close
		//driver.close(); */
	}


}
