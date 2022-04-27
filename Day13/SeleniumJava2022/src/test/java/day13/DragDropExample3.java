package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Helper;

public class DragDropExample3 {

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
		
	driver.get("https://jqueryui.com/draggable/");
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	
	WebElement src=driver.findElement(By.id("draggable"));
	
	int x=src.getLocation().getX();
	
	int y=src.getLocation().getY();
	
	Actions act=new Actions(driver);
	
	System.out.println("Current X and Y cordinates "+x+ " "+y);
	
	act.dragAndDropBy(src, x+100, y+200).perform();
	
	/*
	 act.clickAndHold(src)
	.moveByOffset(x+100, y+100)
	.release()
	.build()
	.perform();
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
