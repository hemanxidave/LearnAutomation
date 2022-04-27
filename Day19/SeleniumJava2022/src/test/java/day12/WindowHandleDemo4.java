package day12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class WindowHandleDemo4 {

	/*
	 * 		How to switch to next window without title without index
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Window handle is "+parentWindow);
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		
		while(itr.hasNext())
		{
			String child=itr.next();
			
			if(!child.equals(parentWindow))
			{
				driver.switchTo().window(child);
				System.out.println("Window found");
				System.out.println("New window title is "+driver.getTitle());
				System.out.println("New window url is "+driver.getCurrentUrl());
				driver.findElement(By.name("email-or-phone")).sendKeys("mukesh@gmail.com");
			}
				
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title is "+driver.getTitle());
		System.out.println("Parent window url is "+driver.getCurrentUrl());
		
	}

}
