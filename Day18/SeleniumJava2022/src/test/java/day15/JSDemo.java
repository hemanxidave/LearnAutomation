package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class JSDemo {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
		
	}

}
