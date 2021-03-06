package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterLogin_SellerPage {
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/signin");
		
		//SignIn with valid info
		driver.findElement(By.id("Email")).sendKeys("gasebe5710@godpeed.com");
		driver.findElement(By.id("Password")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		//navigation buttons
		driver.findElement(By.xpath("//a[contains(text(),'My startup')]")).click();
		/*driver.findElement(By.xpath("//a[contains(text(),'Private requests')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click(); */
		
		/*//form fill up startup
		driver.findElement(By.id("StartupName")).sendKeys("Homemade_Food");
		driver.findElement(By.id("Email")).sendKeys("gasebe5710@godpeed.com");
		driver.findElement(By.id("Website")).sendKeys("www.Homemade_Food.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		/*//Public information form
		driver.findElement(By.id("Startup_AboutCompany")).sendKeys("The HomeMade App is a whole new way to order take-out that delivers fresh homemade food made by your neighbor, straight to your door. Discover local home-based cooks in your community, browse their unique menus, and let them handle the cooking for you! Download the app today and discover a whole new way to eat. It is like the Uber of yummy homemade food! - Hungry Customer");
		driver.findElement(By.id("Startup_AnnualRecurringRevenue")).sendKeys("1000000");
		Select dropdownboxone=new Select(driver.findElement(By.id("Startup_NumberOfCustomers")));
		//dropdownboxone.selectByValue("10-100");
		//dropdownboxone.selectByValue("100-1000");
		//dropdownboxone.selectByValue("1000-10000");
		//dropdownboxone.selectByValue("10000-100000");
		dropdownboxone.selectByValue("more than 100000");
		
		Select dropdownboxtwo=new Select(driver.findElement(By.id("Startup_FoundedYear")));
		dropdownboxtwo.selectByValue("2020");
		/*dropdownboxtwo.selectByValue("2019");
		dropdownboxtwo.selectByValue("2018");
		dropdownboxtwo.selectByValue("2017");
		dropdownboxtwo.selectByValue("2016");
		dropdownboxtwo.selectByValue("2015"); */

		/*Select dropdownboxthree=new Select(driver.findElement(By.id("Startup_FoundedMonth")));
		/*dropdownboxthree.selectByValue("January");
		dropdownboxthree.selectByValue("February");
		dropdownboxthree.selectByValue("March");
		dropdownboxthree.selectByValue("April");
		dropdownboxthree.selectByValue("May");
		dropdownboxthree.selectByValue("June"); */
		//dropdownboxthree.selectByValue("July");
	    
		/*driver.findElement(By.id("Startup_AskingPrice")).sendKeys("1000000");
		driver.findElement(By.cssSelector(".slider")).click();
		driver.findElement(By.id("Startup_StartupTeamSize")).sendKeys("1");
	    driver.findElement(By.xpath("//form[@id='publicInfoForm']//button[@type='submit'][contains(text(),'Update')]")).click(); */
	    
	    //company features
	    driver.findElement(By.id("Features_GrowthOpportunity")).sendKeys("aaaaaaaaaaaaaaa");
	    driver.findElement(By.id("GrowthOpportunityHighlights")).click();
	    driver.findElement(By.xpath("//div[@class='input-group mb-3']//input[@type='text']")).sendKeys("ABCD");
	    driver.findElement(By.id("KeyAssetsHighlights")).click();
	    driver.findElement(By.xpath("//div[@id='KeyAssetsInputs']//div[@class='input-group mb-3']//input[@type='text']")).sendKeys("ABCD");
	    driver.findElement(By.id("Features_Keywords")).sendKeys("aabb");
	    driver.findElement(By.xpath("//form[@id='companyFeaturesForm']//button[@type='submit'][contains(text(),'Update')]")).click();
	    
	    //Selling Details
	    driver.findElement(By.id("Details_Reason")).sendKeys("aaaaaaaaaaaaaaa");
	    driver.findElement(By.id("Details_Financial")).sendKeys("aaaaaaaaaaaaaaa");
	    driver.findElement(By.xpath("//form[@id='companySellingDetails']//button[@type='submit'][contains(text(),'Update')]")).click(); 
	    
		//pic up
	    //driver.findElement(By.cssSelector("#upload-file > div")).click();
	    //driver.findElement(By.id("file-input")).sendKeys("C:\\Users\\hrafa\\OneDrive\\Desktop\\Acquire_Angle_Version-1.0\\Images\\one.png");
	    
		//Page Refresh
	    //driver.navigate().refresh();
	    
		//Private information edit
	    driver.findElement(By.id("btnEditPrivateInfo")).click();
		driver.findElement(By.id("PrivateInfo_CompanyName")).sendKeys("Homemade_Food");
		driver.findElement(By.id("PrivateInfo_CompanyEmail")).sendKeys("gasebe5710@godpeed.com");
		driver.findElement(By.id("PrivateInfo_Website")).sendKeys("www.hmfood.com");
		//driver.findElement(By.id("bntUpdatePrivateInformation")).click();
		driver.findElement(By.id("bntUpdateCancel")).click();
	  
		//Private Req
		driver.findElement(By.xpath("//a[contains(text(),'Private requests')]")).click(); 
		
		//MarketPlace
		driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]")).click();
		
		//driver.findElement(By.id("min_price")).sendKeys("11");
		//driver.findElement(By.id("max_price")).sendKeys("1000000");
		
		//Select dropdownboxfour=new Select(driver.findElement(By.id("customer_number")));
		//dropdownboxfour.selectByValue("All");
		//dropdownboxfour.selectByValue("10-100");
		//dropdownboxfour.selectByValue("100-1000");
		//dropdownboxfour.selectByValue("1000-10000");
		//dropdownboxfour.selectByValue("10000-100000");
		//dropdownboxfour.selectByValue("more than 100000");
		
		WebElement dropdown = driver.findElement(By.id("customer_number"));
		  /*dropdown.findElement(By.xpath("//option[contains(text(),'All')]")).click();
	      dropdown.findElement(By.xpath("//option[contains(text(),'10-100')]")).click();
	      dropdown.findElement(By.xpath("//option[contains(text(),'100-1000')]")).click();
	      dropdown.findElement(By.xpath("//option[contains(text(),'1000-10000')]")).click();
	      dropdown.findElement(By.xpath("//option[contains(text(),'10000-100000')]")).click(); */
		dropdown.findElement(By.xpath("//option[contains(text(),'more than 100000')]")).click();
	      
	      driver.findElement(By.id("searchbox")).sendKeys("zzz");
		  driver.findElement(By.id("reload")).click();
		  
		  /* //settings
		  driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
		  driver.findElement(By.xpath("//a[@class='btn btn-lg float-left btn-light btn-link btn-settings']")).click();
		  driver.findElement(By.xpath("//input[@type='submit']")).click(); */
		  
		  //signout
		  driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		  
		  
		  
	}

}
