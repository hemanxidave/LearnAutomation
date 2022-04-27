package day9.listWithElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class HandleNonSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> allDDvalues=driver.findElements(By.xpath("//a[@role='menuitem']"));
	    
		for(WebElement ele:allDDvalues)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("JavaScript"))
			{
				ele.click();
				if(driver.getTitle().contains("Automation"))
				{
					System.out.println("Page Verified");
				}
				else
				{
					System.out.println("Page not verified");
				}
				break;
			}
		}
		
		driver.quit();
		
	    
	}

}
