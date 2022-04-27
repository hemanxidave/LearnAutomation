package day13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utility.Helper;

public class ScreenShotDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("http://google.com");
		
		try 
		{
			FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/S1.png"));
			
		} catch (IOException e) 
		{
			System.out.println("Something went wrong while copying file "+e.getMessage());
		}
		
		driver.quit();
	}

}
