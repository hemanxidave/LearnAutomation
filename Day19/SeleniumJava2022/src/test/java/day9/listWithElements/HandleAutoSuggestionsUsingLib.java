package day9.listWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class HandleAutoSuggestionsUsingLib {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		
		driver.findElement(By.id("tags")).sendKeys("S");
		
		Thread.sleep(2000);
		
		Helper.selectValueFromList(driver, By.xpath("//div[@class='ui-menu-item-wrapper']"), "Selenium");
		    
	}

}
