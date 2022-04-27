package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utility.Helper;

public class KeyBoardEventsExample1 {

	public static void main(String[] args) {
		
		/*
		 * 	Actions 
		 *  TouchActions
		 * 
		 * 	Mouse Hover
		 *  Keyboard
		 *  Drag Drop
		 *  Mouse Hover with X,Y
		 * 	double click
		 * 	right click
		 * 
		 */
		
	WebDriver driver=Helper.startBrowser("Chrome");
		
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("sample@gmail.com");
	
	Actions act=new Actions(driver);
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	act.sendKeys(Keys.TAB).perform();
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
