package day7.conditional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int marks=100;
		
		System.out.println("Welcome");
		
		if (marks<=35) {
			System.out.println("Fail- Please try again");
		}
		else 
		{
			System.out.println("Succcess");
		}
		
		String browser="Edge";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.quit();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","C:\\Batch Recordings\\Selenium Jan 2022\\geckodriver.exe");
			
			FirefoxDriver driver=new FirefoxDriver();
			driver.quit();
			
		}
		
		
		System.out.println("Thank you");

	}

}
