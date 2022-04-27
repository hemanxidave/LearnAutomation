package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class JSDemo5 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement element=driver.findElement(By.name("lname"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].removeAttribute('disabled');",element);
		
		element.sendKeys("Hello From JS");
		
		
		
	}

}
