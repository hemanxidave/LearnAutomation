package day7.conditional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfDemo {

	public static void main(String[] args) {
		
		int marks=100;
		
		System.out.println("Welcome");
		
		if (marks<=30) {
			System.out.println("Fail- Please try again");
		}
		
		String browser="Edge";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.quit();
		}
		System.out.println("Thank you");

	}

}
