package day4_selenium_configuration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.quit();
		
		
		ChromeDriver driver1=new ChromeDriver();
		
		driver1.get("http://www.yahoo.com");
		
		driver1.quit();
		
		
		ChromeDriver driver2=new ChromeDriver();
		
		driver2.get("http://www.twitter.com");
		
		driver2.quit();

	}

}
