package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterLogin_BuyerPage {
	
	public static void main(String[] args) {
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://www.acquireangel.com/signin");
		
		//SignIn with valid info
		driver.findElement(By.id("Email")).sendKeys("aly1emqj9z@eposta.buzz");
		driver.findElement(By.id("Password")).sendKeys("5BRWBmMjCc55yPG");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		//after login options
		/*driver.findElement(By.xpath("//a[contains(text(),'Private requests')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click(); */
		
		//Picture Upload
		//driver.findElement(By.id("upload-file")).click();
	    //driver.findElement(By.id("file-input")).sendKeys("C:\\Users\\hrafa\\OneDrive\\Desktop\\Acquire_Angle_Version-1.0\\Images\\one.png");
	    
	    //form fillup with valid info
	    driver.findElement(By.id("FirstName")).sendKeys("HUMAYARA");
	    driver.findElement(By.id("LastName")).sendKeys("CHOWDHURY");
	    driver.findElement(By.id("Email")).sendKeys("hrafa783@gmail.com");
	    driver.findElement(By.id("LinkedinProfile")).sendKeys("https://www.linkedin.com/in/humayara-chowdhury/");
	    driver.findElement(By.id("Shortbio")).sendKeys("i don't know");
	    driver.findElement(By.xpath("//div[@class='form-group']//input[@type='submit']")).click();
	    
	    /*//Marketplace Page
	    driver.findElement(By.id("min_price")).sendKeys("100000");
	    driver.findElement(By.id("max_price")).sendKeys("1000000");
	    Select dropdownbox=new Select(driver.findElement(By.id("customer_number")));
	    dropdownbox.selectByValue("10-100");
	    
	    driver.findElement(By.id("min_price")).click();
	    driver.findElement(By.id("min_price")).sendKeys("100000");
	    driver.findElement(By.id("max_price")).click();
	    driver.findElement(By.id("max_price")).sendKeys("10000000");
	    driver.findElement(By.id("customer_number")).click();
	    WebElement dropdown = driver.findElement(By.id("customer_number"));
	    dropdown.findElement(By.xpath("//option[. = '100-1000']")).click();*/
	    
	    //driver.findElement(By.cssSelector(".loop:nth-child(1) > #viewstart .fa")).click();
	    
	    
	    
	    
	    
		
		
		
		
		
	}

}
