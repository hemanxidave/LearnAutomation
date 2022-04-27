package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper 
{
	
	public static WebDriver startBrowser(String browser)
	{
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC") || browser.equalsIgnoreCase("Google Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FF") || browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Batch Recordings\\Selenium Jan 2022\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG") || browser.equalsIgnoreCase("Microsoft Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Batch Recordings\\Selenium Jan 2022\\msedgedriver.exe");
			
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Sorry we do not support this browser");
		}
		
		return driver;
		
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	public static void selectValueFromList(WebDriver driver,By locator,String value)
	{
		List<WebElement> allElements=driver.findElements(locator);
		
		for(WebElement ele:allElements)
		{
			System.out.println("Values from calendar is "+ele.getText());
			
			if(ele.getText().contains(value))
			{
				ele.click();
				break;
			}
		}
	}
	

}
