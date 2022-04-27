package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class SwitchFrameDemo {

	/*
	 * 		How to switch to next window without title without index
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//i[contains(@id,'icon-profile')]")).click();
		
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		
		Thread.sleep(3000);
		
	
		
		//3rd 
		//driver.switchTo().frame(10);
		
		//1 if available
		//driver.switchTo().frame("mukesh");
		
		//2 using WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		//NoSuchElementException if we dont switch to frame and try to find element which is inside IFrame
		driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]")).sendKeys("889898989");
		
		driver.switchTo().defaultContent();
		
	}

}
