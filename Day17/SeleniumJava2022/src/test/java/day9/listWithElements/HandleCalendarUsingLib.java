package day9.listWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class HandleCalendarUsingLib {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(2000);
		
		Helper.selectValueFromList(driver, By.xpath("//a[@class='ui-state-default']"), "22");
	    
	}

}
