package day4_selenium_configuration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest2Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
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
