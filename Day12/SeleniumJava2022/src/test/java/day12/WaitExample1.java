package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample1 {

	/*
	 * 		How to switch to next window without title without index
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		/*
		 *  250 ms - polling
		 *  0- default
		 *  smart wait
		 *  dynamic wait
		 *  call once
		 *  element should be in dom + visible
		 *  call after get method 
		 */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println(driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed());
		
		
	
		
	}

}
