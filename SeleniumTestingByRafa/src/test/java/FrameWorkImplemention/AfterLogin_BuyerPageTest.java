package FrameWorkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import FrameWorkImplemention.AfterLogin_BuyerPageObject;

public class AfterLogin_BuyerPageTest {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://acquireangel.com/signin");
		
		//sign in valid info
		AfterLogin_BuyerPageObject.emailaddress(driver).sendKeys("aly1emqj9z@eposta.buzz");
		AfterLogin_BuyerPageObject.password(driver).sendKeys("5BRWBmMjCc55yPG");
		/*//invalid info
		AfterLogin_BuyerPageObject.emailaddress(driver).sendKeys("gasebe5710@godpeed  com");
		AfterLogin_BuyerPageObject.password(driver).sendKeys("          "); */
		
		AfterLogin_BuyerPageObject.rememberme(driver).click();
		AfterLogin_BuyerPageObject.signin(driver).click(); 
		
		/*//forgot password
		AfterLogin_BuyerPageObject.forgotpassword(driver).click();
		AfterLogin_BuyerPageObjectt.emailaddress(driver).sendKeys("hrafa783@gmail.com");
		AfterLogin_BuyerPageObject.send(driver).click(); */
		
		//linkedin login
		//AfterLogin_BuyerPageObject.linkedIn(driver).click();
		
		//signup
		//AfterLogin_BuyerPageObjectt.signup(driver).click();
		
		//After login navigate bar options
		//AfterLogin_BuyerPageObject.privaterequests(driver).click();
		
		//contact info 
		//driver.navigate().to("https://acquireangel.com/ContactInfo");
		/*AfterLogin_BuyerPageObject.pictureupload(driver).click();
		AfterLogin_BuyerPageObject.pictureupload(driver).sendKeys("C:\\Users\\hrafa\\OneDrive\\Desktop\\Acquire_Angle_Version-1.0\\Images\\b.png"); */
		
		/*AfterLogin_BuyerPageObject.firstname(driver).sendKeys("Humayara");
		AfterLogin_BuyerPageObject.lastname(driver).sendKeys("Chowdhury");
		AfterLogin_BuyerPageObject.contactemail(driver).sendKeys("hrafa783@gmail.com");
		AfterLogin_BuyerPageObject.linkedinlink(driver).sendKeys("https://www.linkedin.com/in/humayara-chowdhury/");
		AfterLogin_BuyerPageObject.shortbio(driver).sendKeys("i don't know");
		AfterLogin_BuyerPageObject.savechanges(driver).click(); */
		
		/* //marketplace
		AfterLogin_BuyerPageObject.marketplace(driver).click();
		AfterLogin_BuyerPageObject.minprice(driver).sendKeys("10000");
		AfterLogin_BuyerPageObject.maxprice(driver).sendKeys("100000000");
		//AfterLogin_BuyerPageObject.customernumber(driver).selectByValue("10-100");
		AfterLogin_BuyerPageObject.searchbox(driver).sendKeys("abcd");
		AfterLogin_BuyerPageObject.reload(driver).click(); 
		
		//description ..........open to offers button not working(Website)
		//AfterLogin_BuyerPageObject.openone(driver).click();
		//AfterLogin_BuyerPageObject.opentwo(driver).click();
		AfterLogin_BuyerPageObject.arrowone(driver).click();
		//AfterLogin_BuyerPageObject.arrowtwo(driver).click();
		AfterLogin_BuyerPageObject.proceedtochat(driver).click();
		AfterLogin_BuyerPageObject.messageboxtwo(driver).sendKeys("hello");
		AfterLogin_BuyerPageObject.chatsent(driver).click(); */
		
		AfterLogin_BuyerPageObject.settings(driver).click();
		AfterLogin_BuyerPageObject.changedata(driver).click();
		
		AfterLogin_BuyerPageObject.cpassword(driver).click();
		/*AfterLogin_SellerPageObject.currentpassword(driver).sendKeys("5BRWBmMjCc55yPG");
		AfterLogin_SellerPageObject.newpassword(driver).sendKeys("abcd1234");
		AfterLogin_SellerPageObject.confrimpassword(driver).sendKeys("abcd1234");
		AfterLogin_SellerPageObject.change(driver).click(); 
		
		AfterLogin_SellerPageObject.logout(driver).click();
		AfterLogin_SellerPageObject.archivedaccount(driver).click(); */
		
		AfterLogin_BuyerPageObject.signout(driver).click();
		
}
}
