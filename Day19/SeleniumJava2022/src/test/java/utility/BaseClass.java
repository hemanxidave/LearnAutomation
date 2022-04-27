package utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {


	public WebDriver driver;
	
	@Parameters("Browser")
	@BeforeClass
	public void setup(String browserName)
	{
		System.out.println("LOG:INFO-Setup is running");
		driver=Helper.startBrowser(browserName);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"),"Title did not match");
		System.out.println("LOG:INFO-Browser is up and running");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO-Teardown is running");
		Helper.closeBrowser(driver);
		//Assert.assertNull(driver);
		System.out.println("LOG:INFO-Session terminated");
	}
}
