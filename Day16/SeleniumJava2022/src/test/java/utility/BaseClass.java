package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {


	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.out.println("LOG:INFO-Setup is running");
		driver=Helper.startBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("LOG:INFO-Browser is up and running");
	}
	
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO-Teardown is running");
		Helper.closeBrowser(driver);
		System.out.println("LOG:INFO-Session terminated");
	}
}
