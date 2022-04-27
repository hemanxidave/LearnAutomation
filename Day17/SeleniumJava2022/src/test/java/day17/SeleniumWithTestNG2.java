package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class SeleniumWithTestNG2 extends BaseClass 
{
	
	@Test(description = "login",priority = 1)
	public void loginApplication()
	{
		WebElement username=driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();		
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login failed");
	}

	@Test(description = "logout",priority = 2,dependsOnMethods = "loginApplication")
	public void logOut()
	{
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Logout failed");
	}
	

}
