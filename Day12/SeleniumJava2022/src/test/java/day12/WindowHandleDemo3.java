package day12;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class WindowHandleDemo3 {

	/*
	 * 		How to switch to specific window using title or url
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Window handle is "+parentWindow);
		
		List<WebElement> allIcons= driver.findElements(By.xpath("//div[@id='social-icons']//img"));
	
		for(WebElement ele:allIcons)
		{
			ele.click();
		}
		
		Set<String> allWindows=driver.getWindowHandles();
		
	
		for(String handle:allWindows)
		{	
			
			if(driver.switchTo().window(handle).getTitle().contains("LinkedIn"))
			{
				System.out.println("Window found");
				System.out.println("New window title is "+driver.getTitle());
				System.out.println("New window url is "+driver.getCurrentUrl());
				driver.findElement(By.name("email-or-phone")).sendKeys("mukesh@gmail.com");
				Thread.sleep(3000);
				break;
			}
			else
			{
				System.out.println("Still searching for desired windows");
				driver.switchTo().window(parentWindow);
			}
			
		}
		
		driver.switchTo().window(parentWindow);
		
		
	
		
	}

}
