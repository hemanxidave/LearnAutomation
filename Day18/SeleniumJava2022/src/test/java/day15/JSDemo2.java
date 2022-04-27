package day15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class JSDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById(\"persistent\").click()");
		
		
		
	}

}
