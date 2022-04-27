package day7.conditional;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please select browser for execution");
		
		String browser=sc.next();
		
		WebDriver driver = null;
		
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
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit();
		sc.close();
	
	}
	
	
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
	
	
	

}
