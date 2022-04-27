package day14;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassDemo3 
{
	
	/*  opt.setAcceptInsecureCerts(true);
	 * 	How to handle SSL certificate
	 *  Insecure web application
	 *  Invalid certificate
	 *  Expired certificate
	 *  https web application
	 *  
	 *  
	 * 
	 */
	

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		opt.setHeadless(true);
		
		opt.addExtensions(new File("./Plugins/SelectorsHub.crx"));
		
		WebDriver driver=new ChromeDriver(opt);	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Page title "+driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.isDisplayed());

		System.out.println(username.isEnabled());
		
		System.out.println(username.getTagName());
			
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();
		
		System.out.println("Page URL "+driver.getCurrentUrl());
		
		//driver.quit();

	}

}
