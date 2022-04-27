package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BaseClass;

public class SeleniumWithTestNG2 extends BaseClass 
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
		
		driver.findElement(By.className("button")).click();		
	}

	@Test(description = "logout",priority = 2,dependsOnMethods = "loginApplication")
	public void logOut()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
