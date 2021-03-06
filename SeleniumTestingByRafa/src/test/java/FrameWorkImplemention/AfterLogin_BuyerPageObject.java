package FrameWorkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AfterLogin_BuyerPageObject {
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
	
	//contact info
	/*public static WebElement pictureupload(WebDriver driver)
	{
     element=driver.findElement(By.id("upload-file"));
     return element;
    } */
	
	public static WebElement firstname(WebDriver driver)
	{
     element=driver.findElement(By.id("FirstName"));
     return element;
    }
	public static WebElement lastname(WebDriver driver)
	{
     element=driver.findElement(By.id("LastName"));
     return element;
    }
	public static WebElement contactemail(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
	public static WebElement linkedinlink(WebDriver driver)
	{
     element=driver.findElement(By.id("LinkedinProfile"));
     return element;
    }
	public static WebElement shortbio(WebDriver driver)
	{
     element=driver.findElement(By.id("Shortbio"));
     return element;
    }
	public static WebElement savechanges(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//div[@class='form-group']//input[@type='submit']"));
     return element;
     
    }
	
	//marketplace
	public static WebElement minprice(WebDriver driver)
	{
     element=driver.findElement(By.id("min_price"));
     return element;
    }
	public static WebElement maxprice(WebDriver driver)
	{
     element=driver.findElement(By.id("max_price"));
     return element;
    }
	public static Select customernumber(WebDriver driver)
	{
	Select dropdownboxfour=new Select(driver.findElement(By.id("customer_number")));
     return dropdownboxfour;
    }
	public static WebElement searchbox(WebDriver driver)
	{
     element=driver.findElement(By.id("searchbox"));
     return element;
    }
	public static WebElement reload(WebDriver driver)
	{
     element=driver.findElement(By.id("reload"));
     return element;
    }
	
	public static WebElement openone(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//body/div[@class='container font-12px']/div[@class='row']/div[@class='col-md-12']/div[@id='viewdata']/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
     return element;
    }
	
	public static WebElement opentwo(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//body/div[@class='container font-12px']/div[@class='row']/div[@class='col-md-12']/div[@id='viewdata']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
     return element;
    }
	
	public static WebElement arrowone(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//body/div[@class='container font-12px']/div[@class='row']/div[@class='col-md-12']/div[@id='viewdata']/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]"));
     return element;
    } 
	
	public static WebElement arrowtwo(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//body/div[@class='container font-12px']/div[@class='row']/div[@class='col-md-12']/div[@id='viewdata']/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]/i[1]"));
     return element;
    } 
	
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
	public static WebElement changedata(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//a[contains(text(),'Change data')]"));
     return element;
    }
	
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
