package day19;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.LoginPage;
import utility.ConfigUtlity;
import utility.DataProviders;
import utility.Helper;

public class DDTWithSelenium6 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=Helper.startBrowser(ConfigUtlity.getValue("browser"));
		
		driver.get(ConfigUtlity.getValue("qaUrl"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		Helper.closeBrowser(driver);
	}
	
	
	@Test(dataProvider = "login",dataProviderClass = DataProviders.class)
	public void logins(String uname,String pass)
	{
		
		LoginPage login=new LoginPage(driver);
		
		Dashboard dash=login.loginToApplicationNew(uname, pass);

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed");
	
		dash.logOut();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout failed");
	}

}
