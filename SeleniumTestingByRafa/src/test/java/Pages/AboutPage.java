package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AboutPage {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/buyers");
				
		/*//Page title capture
	    System.out.println("Title of the page:  "+driver.getTitle());
			
		//current URL capture
		System.out.println("Current url of the page: "+driver.getCurrentUrl());
			
		//Capturing page source code
		System.out.println("Page source code: "+driver.getPageSource());*/
		
		//new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		
		//open another URL
		driver.navigate().to("https://acquireangel.com/about");
		
		//back to home page
		driver.findElement(By.linkText("acquireangel")).click();
		
		//footer
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd1234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		
		//social_icons
		driver.findElement(By.xpath("//span[@class='icon-twitter']")).click();
		driver.findElement(By.xpath("//span[@class='icon-facebook']")).click();
		driver.findElement(By.xpath("//span[@class='icon-instagram']")).click();
				
		//tab close
		driver.close();
	}

}


