package day11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class ExceptionHandlingWithSelenium {

	public static void main(String[] args) {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://www.google.com");

		for(int i=0;i<20;i++)
		{
			try 
			{
				driver.findElement(By.id("damodar"));
			} 
			catch (Throwable e) 
			{
				System.out.println("Lets wait for damodar");
				System.out.println(e.getMessage());
			}
			Helper.waitForElement(1);
		}
		
		
		
	}

}
