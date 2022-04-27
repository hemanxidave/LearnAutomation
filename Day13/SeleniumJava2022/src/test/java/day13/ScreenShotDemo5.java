package day13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utility.Helper;

public class ScreenShotDemo5 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://ksrtc.in/oprs-web/");
		
		File src=driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileHandler.copy(src, new File("./Screenshots/Element"+Helper.getCurrentDateTime()+".png"));
		} catch (IOException e) 
		{
			System.out.println("Unable to capture screenshot of WebElement");
		}
		
		driver.quit();
	}

}
