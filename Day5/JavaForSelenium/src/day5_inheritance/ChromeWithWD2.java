package day5_inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWithWD2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("URL is "+driver.getCurrentUrl());
		
		//System.out.println("Page Source is "+driver.getPageSource());
		
		System.out.println("Current handle is "+driver.getWindowHandle());
		
		System.out.println("All handles "+driver.getWindowHandles());
		
		driver.get("http://twitter.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
