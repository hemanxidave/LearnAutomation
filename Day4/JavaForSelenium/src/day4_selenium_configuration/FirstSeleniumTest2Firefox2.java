package day4_selenium_configuration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest2Firefox2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Batch Recordings\\Selenium Jan 2022\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("Title is "+driver.getCurrentUrl());
		
		driver.get("http://www.yahoo.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("Title is "+driver.getCurrentUrl());
		
		driver.get("http://www.facebook.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("Title is "+driver.getCurrentUrl());
		
		driver.get("http://www.twitter.com");
		
		System.out.println("Title is "+driver.getTitle());
		
		System.out.println("Title is "+driver.getCurrentUrl());
		
		driver.quit();

	}

}
