package FrameWorkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AfterLogin_SellerPageObject {
	
		private static WebElement element=null;
		WebElement dropdownbox=null;
		
		
		public static WebElement emailaddress(WebDriver driver)
		{
	     element=driver.findElement(By.id("Email"));
	     return element;
	    }
		
		
		public static WebElement password(WebDriver driver)
		{
	     element=driver.findElement(By.id("Password"));
	     return element;
	    }
	      
		public static WebElement rememberme(WebDriver driver)
		{
	     element=driver.findElement(By.id("IsRemember"));
	     return element;
	    }
		
		public static WebElement signin(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	     return element;
	     
	    }
		
		public static WebElement forgotpassword(WebDriver driver)
		{
		 element=driver.findElement(By.xpath("//a[@class='float-right']"));
		 return element;
		}
		
		public static WebElement send(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//input[@type='submit']"));
	     return element;
	     
	    }
		
		public static WebElement linkedIn(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//button[normalize-space()='LinkedIn']"));
	     return element;
	     
	    }
		public static WebElement signup(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[@class='text-info']"));
	     return element;
	     
	    }
		
		public static WebElement mystartup(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'My startup')]"));
	     return element;
	     
	    }
		
		public static WebElement privaterequests(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Private requests')]"));
	     return element;
	     
	    }
		public static WebElement marketplace(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Marketplace')]"));
	     return element;
	     
	    }
		public static WebElement settings(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
	     return element;
	     
	    }
		public static WebElement signout(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	     return element;
	     
	    }
		
		public static WebElement startupname(WebDriver driver)
		{
	     element=driver.findElement(By.id("StartupName"));
	     return element;
	    }
		
		public static WebElement website(WebDriver driver)
		{
	     element=driver.findElement(By.id("Website"));
	     return element;
	    }
		
		public static WebElement submit(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//input[@type='submit']"));
	     return element;
	    }
		
		public static WebElement startup_AboutCompany(WebDriver driver)
		{
	     element=driver.findElement(By.id("Startup_AboutCompany"));
	     return element;
	    }
	    
		public static WebElement startup_annualRecurringRevenue(WebDriver driver)
		{
	     element=driver.findElement(By.id("Startup_AnnualRecurringRevenue"));
	     return element;
	    }
		public static Select numberofcustomers(WebDriver driver)
		{
	     Select dropdownboxone= new Select(driver.findElement(By.id("Startup_NumberOfCustomers")));
	     return dropdownboxone;
	    }
		public static Select foundedyear(WebDriver driver)
		{
		 Select dropdownboxtwo=new Select(driver.findElement(By.id("Startup_FoundedYear")));
	     return dropdownboxtwo;
	    }
		public static Select foundedmonth(WebDriver driver)
		{
		Select dropdownboxthree=new Select(driver.findElement(By.id("Startup_FoundedMonth")));
	     return dropdownboxthree;
	    }
		public static WebElement askingprice(WebDriver driver)
		{
	     element=driver.findElement(By.id("Startup_AskingPrice"));
	     return element;
	    }
		public static WebElement slider(WebDriver driver)
		{
	     element=driver.findElement(By.cssSelector(".slider"));
	     return element;
	    }
		public static WebElement  teamsize(WebDriver driver)
		{
	     element=driver.findElement(By.id("Startup_StartupTeamSize"));
	     return element;
	    }
		public static WebElement  updateone(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//form[@id='publicInfoForm']//button[@type='submit'][contains(text(),'Update')]"));
	     return element;
	    }
		public static WebElement growthopportunity(WebDriver driver)
		{
	     element=driver.findElement(By.id("Features_GrowthOpportunity"));
	     return element;
	    }
		
		public static WebElement growthopportunityhighlights(WebDriver driver)
		{
	     element=driver.findElement(By.id("GrowthOpportunityHighlights"));
	     return element;
	    }
		public static WebElement KeyAssetsHighlights(WebDriver driver)
		{
	     element=driver.findElement(By.id("KeyAssetsHighlights"));
	     return element;
	    }
		public static WebElement featureskeywords(WebDriver driver)
		{
	     element=driver.findElement(By.id("Features_Keywords"));
	     return element;
	    }
		
		public static WebElement  updatetwo(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//form[@id='companyFeaturesForm']//button[@type='submit'][contains(text(),'Update')]"));
	     return element;
	    }
		
		
		
		public static WebElement detailsreason(WebDriver driver)
		{
	     element=driver.findElement(By.id("Details_Reason"));
	     return element;
	    }
		public static WebElement detailsfinancial(WebDriver driver)
		{
	     element=driver.findElement(By.id("Details_Financial"));
	     return element;
	    }
		public static WebElement  updatethree(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//form[@id='companySellingDetails']//button[@type='submit'][contains(text(),'Update')]"));
	     return element;
	    }
		
		//Private information edit
		public static WebElement PrivateInfo_CompanyName(WebDriver driver)
		{
	     element=driver.findElement(By.id("PrivateInfo_CompanyName"));
	     return element;
	    }
		public static WebElement PrivateInfo_CompanyEmail(WebDriver driver)
		{
	     element=driver.findElement(By.id("PrivateInfo_CompanyEmail"));
	     return element;
	    }
		public static WebElement PrivateInfo_Website(WebDriver driver)
		{
	     element=driver.findElement(By.id("PrivateInfo_Website"));
	     return element;
	    }
		//picup
		public static WebElement pictureupload(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	     return element;
	    } 
		
		
		public static WebElement edit(WebDriver driver)
		{
	     element=driver.findElement(By.id("btnEditPrivateInfo"));
	     return element;
	    }
		
		public static WebElement update(WebDriver driver)
		{
	     element=driver.findElement(By.id("bntUpdatePrivateInformation"));
	     return element;
	    }
		public static WebElement cancel(WebDriver driver)
		{
	     element=driver.findElement(By.id("bntUpdateCancel"));
	     return element;
	    }
		
		//marketplace inner info
		
		
		public static WebElement messageboxone(WebDriver driver)
		{
	     element=driver.findElement(By.id("Message"));
	     return element;
	    }
		
		public static WebElement sendreq(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//button[@type='submit']"));
	     return element;
	    } 
		
		public static WebElement proceedtochat(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Proceed to chat')]"));
	     return element;
	    }
		public static WebElement messageboxtwo(WebDriver driver)
		{
	     element=driver.findElement(By.id("Message"));
	     return element;
	    }
		public static WebElement chatsent(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//i[@class='fa fa-paper-plane']"));
	     return element;
	    }
		
		//setting inner
		public static WebElement cpassword(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[contains(text(),'Change Password')]"));
	     return element;
	    }
		public static WebElement currentpassword(WebDriver driver)
		{
	     element=driver.findElement(By.id("CurrentPassword"));
	     return element;
	    }
		public static WebElement newpassword(WebDriver driver)
		{
	     element=driver.findElement(By.id("Password"));
	     return element;
	    }
		public static WebElement confrimpassword(WebDriver driver)
		{
	     element=driver.findElement(By.id("ConfirmPassword"));
	     return element;
	    }
		public static WebElement change(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//input[@type='submit']"));
	     return element;
	    }
		
		
		public static WebElement logout(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//a[@class='btn btn-lg float-left btn-light btn-link btn-settings']"));
	     return element;
	    }
		public static WebElement archivedaccount(WebDriver driver)
		{
	     element=driver.findElement(By.xpath("//input[@type='submit']"));
	     return element;
	    }
		
}       
