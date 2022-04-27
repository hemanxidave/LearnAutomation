package day13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utility.Helper;

public class ScreenShotDemo {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("http://google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshots/S1.png");
		
		try 
		{
			FileHandler.copy(src, dest);
		} catch (IOException e) 
		{
			System.out.println("Something went wrong while copying file "+e.getMessage());
		}
		
		driver.quit();
	}

}
