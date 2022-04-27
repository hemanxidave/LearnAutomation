package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Helper;

public class SeleniumWithTestNG {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=Helper.startBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(description = "login",priority = 1)
	public void loginApplication()
	{
		WebElement username=driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();		
	}

	@Test(description = "logout",priority = 2,dependsOnMethods = "loginApplication")
	public void logOut()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void tearDown()
	{
		Helper.closeBrowser(driver);
	}
	
	
}
