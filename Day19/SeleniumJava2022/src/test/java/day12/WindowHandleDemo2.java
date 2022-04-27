package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class WindowHandleDemo2 {

	/*
	 * 		How to switch to 3rd tab in application using Selenium
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Window handle is "+parentWindow);
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		System.out.println("All window handles "+allWindows);
		
		// 1 way convert set into list
		List<String> allWindowsAsList=new ArrayList<String>(allWindows);
	
		String childWindow=allWindowsAsList.get(1);
		
		// NoSuchWindowException
		//driver.switchTo().window("Selenium");
		
		driver.switchTo().window(childWindow);
		
		System.out.println("New window title is "+driver.getTitle());
		System.out.println("New window url is "+driver.getCurrentUrl());
		driver.findElement(By.name("email-or-phone")).sendKeys("mukesh@gmail.com");
		
		// close current tab/windows
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Main window title "+driver.getTitle());
		System.out.println("Main window url"+driver.getCurrentUrl());
	
		// it will close every associated windows
		driver.quit();
	
	
		
	}

}
