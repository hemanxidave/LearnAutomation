package day12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample4 {

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        
		wait.until(ExpectedConditions.titleContains("Selenium"));
		
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.urlContains("http://seleniumpractise.blogspot.com"));
		
		// 10, 20 ,30
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Mukesh']")));
				
		
	}

}
