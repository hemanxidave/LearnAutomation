package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.Helper;

public class SeleniumWithTestNG3 extends BaseClass 
{
	
	@Test(description = "login",priority = 1)
	public void loginApplication()
	{
		System.out.println("Thread id "+Thread.currentThread().getId());
		System.out.println("Thread name "+Thread.currentThread().getName());
		System.out.println("Thread group "+Thread.currentThread().getThreadGroup());
		System.out.println("Thread priority "+Thread.currentThread().getPriority());
		
		WebElement username=driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Helper.clickOnElement(driver, By.className("button"));
		
	}

	@Test(description = "logout",priority = 2,dependsOnMethods = "loginApplication")
	public void logOut()
	{
		Helper.clickOnElement(driver, By.id("welcome"));
		Helper.clickOnElement(driver, By.linkText("Logout"));
	
	}
	

}
