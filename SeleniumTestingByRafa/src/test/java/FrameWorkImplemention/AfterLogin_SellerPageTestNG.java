package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AfterLogin_SellerPageTestNG {
private static WebDriver driver=null;
	
	@BeforeTest
		public void setUpTest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	@Test
		public void stepone() throws InterruptedException
	{
		//URL visit
				driver.get("https://acquireangel.com/signin");
				
				//sign in valid info
				AfterLogin_SellerPageObject.emailaddress(driver).sendKeys("gasebe5710@godpeed.com");
				AfterLogin_SellerPageObject.password(driver).sendKeys("abcd1234");
				/*//invalid info
				AfterLogin_SellerPageObject.emailaddress(driver).sendKeys("gasebe5710@godpeed  com");
				AfterLogin_SellerPageObject.password(driver).sendKeys("          "); */
				
				AfterLogin_SellerPageObject.rememberme(driver).click();
				AfterLogin_SellerPageObject.signin(driver).click(); 
				
				/*//forgot password
				AfterLogin_SellerPageObject.forgotpassword(driver).click();
				AfterLogin_SellerPageObject.emailaddress(driver).sendKeys("hrafa783@gmail.com");
				AfterLogin_SellerPageObject.send(driver).click(); */
				
				//linkedin login
				//AfterLogin_SellerPageObject.linkedIn(driver).click();
				
				//signup
				//AfterLogin_SellerPageObject.signup(driver).click();
				
				/*//new startup page open
				AfterLogin_SellerPageObject.startupname(driver).sendKeys("Homemade_Food");
				AfterLogin_SellerPageObject.emailaddress(driver).sendKeys("gasebe5710@godpeed.com");
				AfterLogin_SellerPageObject.website(driver).sendKeys("www.Homemade_Food.com");
				AfterLogin_SellerPageObject.submit(driver).click(); */
				
				//Basic information about startup numbers and history
				/*AfterLogin_SellerPageObject.mystartup(driver).click();
				AfterLogin_SellerPageObject.startup_AboutCompany(driver).sendKeys("The HomeMade App is a whole new way to order take-out that delivers fresh homemade food made by your neighbor, straight to your door. Discover local home-based cooks in your community, browse their unique menus, and let them handle the cooking for you! Download the app today and discover a whole new way to eat. It is like the Uber of yummy homemade food! - Hungry Customer");
				AfterLogin_SellerPageObject.startup_annualRecurringRevenue(driver).sendKeys("10000"); */
				
				//drop down box one
				/*AfterLogin_SellerPageObject.numberofcustomers(driver).selectByValue("10-100");
				AfterLogin_SellerPageObject.numberofcustomers(driver).selectByValue("100-1000");
				AfterLogin_SellerPageObject.numberofcustomers(driver).selectByValue("1000-10000");
				AfterLogin_SellerPageObject.numberofcustomers(driver).selectByValue("10000-100000"); 
				AfterLogin_SellerPageObject.numberofcustomers(driver).selectByValue("more than 100000"); */
				
				/*//drop down box two
				AfterLogin_SellerPageObject.foundedyear(driver).selectByValue("2020");
				AfterLogin_SellerPageObject.foundedyear(driver).selectByValue("2019");
				AfterLogin_SellerPageObject.foundedyear(driver).selectByValue("2018");
				AfterLogin_SellerPageObject.foundedyear(driver).selectByValue("2017");*/
				
				//drop down box three
				/*AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("January");
				AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("February");
				AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("March");
				AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("April");
				AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("May");
				AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("June"); */
				/*AfterLogin_SellerPageObject.foundedmonth(driver).selectByValue("July");
				
			   AfterLogin_SellerPageObject.askingprice(driver).sendKeys("10000000000000");
			   AfterLogin_SellerPageObject.slider(driver).click();
			   AfterLogin_SellerPageObject.teamsize(driver).sendKeys("11");
			   AfterLogin_SellerPageObject.updateone(driver).click(); 
			   
			   Thread.sleep(2000);
			   
			   //Company features
			   AfterLogin_SellerPageObject.growthopportunity(driver).sendKeys("abcdefghij");
			   AfterLogin_SellerPageObject.growthopportunityhighlights(driver).sendKeys("zzzz");
			   AfterLogin_SellerPageObject.KeyAssetsHighlights(driver).sendKeys("xxxx");
		       AfterLogin_SellerPageObject.featureskeywords(driver).sendKeys("food");
		       AfterLogin_SellerPageObject.updatetwo(driver).click();
		       
		       
		       //selling details
		       AfterLogin_SellerPageObject.detailsreason(driver).sendKeys("Don't Know");
		       AfterLogin_SellerPageObject.detailsfinancial(driver).sendKeys("1000");
		       AfterLogin_SellerPageObject.updatethree(driver).click(); 
		       
		       Thread.sleep(2000); 
		       //Private Info Edit
			   AfterLogin_SellerPageObject.edit(driver).click();
		       AfterLogin_SellerPageObject.PrivateInfo_CompanyName(driver).sendKeys("Homemade_Food");
		       AfterLogin_SellerPageObject.PrivateInfo_CompanyEmail(driver).sendKeys("gasebe5710@godpeed.com");
		       AfterLogin_SellerPageObject.PrivateInfo_Website(driver).sendKeys("www.hmfood.com");
		       AfterLogin_SellerPageObject.update(driver).click();
		       //pic up
		       AfterLogin_SellerPageObject.pictureupload(driver).sendKeys("C:\\Users\\hrafa\\OneDrive\\Desktop\\Acquire_Angle_Version-1.0\\Images\\one.png");
		      
		       //AfterLogin_SellerPageObject.cancel(driver).click(); */
				
			   //Private Req
				AfterLogin_SellerPageObject.privaterequests(driver).click();
				
				//MarketPlace
				AfterLogin_SellerPageObject.marketplace(driver).click();
				/* AfterLogin_SellerPageObject.minprice(driver).sendKeys("1000");
				AfterLogin_SellerPageObject.maxprice(driver).sendKeys("1000000"); */
				
				//drop down box four_______________not working
				/*AfterLogin_SellerPageObject.customernumber(driver).selectByValue("All");
				AfterLogin_SellerPageObject.customernumber(driver).selectByValue("10-100");
				AfterLogin_SellerPageObject.customernumber(driver).selectByValue("100-1000");
				AfterLogin_SellerPageObject.customernumber(driver).selectByValue("1000-10000");
				AfterLogin_SellerPageObject.customernumber(driver).selectByValue("10000-100000"); 
				AfterLogin_SellerPageObject.customernumber(driver).selectByValue("more than 100000"); 
				
		       AfterLogin_SellerPageObject.searchbox(driver).sendKeys("abcd");
		       AfterLogin_SellerPageObject.reload(driver).click();
		       
		       //lower arrow
		       AfterLogin_SellerPageObject.arrowone(driver).click();
		       //AfterLogin_SellerPageObject.arrowtwo(driver).click();
		       
		       //Send Req
		       AfterLogin_SellerPageObject.messageboxone(driver).sendKeys("i am nobody");
		       AfterLogin_SellerPageObject.sendreq(driver).click();
		       
		       //chatbot___________not working
		       AfterLogin_SellerPageObject.proceedtochat(driver).click();
		       AfterLogin_SellerPageObject.messageboxtwo(driver).sendKeys("hi");
		       AfterLogin_SellerPageObject.chatsent(driver).click();    */   
				
				
				//settings
				AfterLogin_SellerPageObject.settings(driver).click();
				/*AfterLogin_SellerPageObject.cpassword(driver).click();
				AfterLogin_SellerPageObject.currentpassword(driver).sendKeys("5BRWBmMjCc55yPG");
				AfterLogin_SellerPageObject.newpassword(driver).sendKeys("abcd1234");
				AfterLogin_SellerPageObject.confrimpassword(driver).sendKeys("abcd1234");
				AfterLogin_SellerPageObject.change(driver).click(); 
				
				AfterLogin_SellerPageObject.logout(driver).click();
				AfterLogin_SellerPageObject.archivedaccount(driver).click(); */
				
				
				//signout
				AfterLogin_SellerPageObject.signout(driver).click();
	}
	
	@AfterTest
	public void tearDown()
{
	driver.close();

}
}
