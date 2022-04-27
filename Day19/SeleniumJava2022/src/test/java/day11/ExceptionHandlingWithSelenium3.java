package day11;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class ExceptionHandlingWithSelenium3 {

	public static void main(String[] args) {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
	
		for(int i=0;i<20;i++)
		{
			try 
			{
				driver.findElement(By.xpath("//p[text()='WebDriver']"));
				System.out.println("text found");
				break;
			} 
			catch (NoSuchElementException e) 
			{
				System.out.println("Waiting for text");
				//System.out.println(e.getMessage());
			}
			Helper.waitForElement(1);
		}
		
		
		
	}

}
