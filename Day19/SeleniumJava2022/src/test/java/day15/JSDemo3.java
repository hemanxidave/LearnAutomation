package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class JSDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://login.yahoo.com/");
		
		WebElement email=driver.findElement(By.name("username"));
		
		WebElement element=driver.findElement(By.id("persistent"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("alert('Swati')","Mukesh","Selenium","Swati","Jenkins");
		
		
		js.executeScript("arguments[0].value=arguments[1]", email,"selenium@yahoo.com");
		
		js.executeScript("arguments[0].click()",element);
		
		
		
	}

}
