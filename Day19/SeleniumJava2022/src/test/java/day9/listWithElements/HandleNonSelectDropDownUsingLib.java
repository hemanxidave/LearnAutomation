package day9.listWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class HandleNonSelectDropDownUsingLib {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(2000);
		
		Helper.selectValueFromList(driver, By.xpath("//a[@role='menuitem']"), "JavaScript");
		
		if(driver.getTitle().contains("Automation"))
		{
			System.out.println("Page Verified");
		}
		else
		{
			System.out.println("Page not verified");
		}
		
		
		driver.quit();
		
	    
	}

}
