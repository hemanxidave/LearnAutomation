package day16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class HandleBrokenImages {

	public static void main(String[] args) throws IOException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("https://the-internet.herokuapp.com/broken_images");
				
		List<WebElement> allImages=driver.findElements(By.xpath("//img[@src]"));
		
		ArrayList<String> allBrokenImages=Helper.brokenImageChecker(allImages);
		
		if(allBrokenImages.size()==0)
		{
			System.out.println("Test Passed No Broken Image Found");
		}
		else
		{
			System.out.println("Test Failed Total Broken Images "+allBrokenImages.size());
		
			for(String link:allBrokenImages)
			{
				System.out.println("Images src "+link);
			}
			
		}
		
		
		
	}
	


}
