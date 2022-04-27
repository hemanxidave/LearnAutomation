package day9.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Helper;

public class HandleDropDownException {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
		Select monthDD=new Select(driver.findElement(By.id("month")));
	     
	    monthDD.selectByVisibleText("oct"); 
	}

}
