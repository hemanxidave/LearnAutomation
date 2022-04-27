package day4_selenium_configuration;

import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumTestEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Batch Recordings\\Selenium Jan 2022\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
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
