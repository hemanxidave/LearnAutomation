package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class JSDemo6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://selectorshub.com/xpath-practice-page/");
			
		Thread.sleep(1000);
		
		SearchContext shadow = driver.findElement(By.cssSelector("#userName")).getShadowRoot();
		
		Thread.sleep(1000);
		
		shadow.findElement(By.cssSelector("#kils")).sendKeys("Hello");
		
		
		
	}

}
