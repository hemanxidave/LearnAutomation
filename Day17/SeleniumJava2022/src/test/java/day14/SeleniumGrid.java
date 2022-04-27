package day14;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) {

		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("os", "OS X");

		caps.setCapability("os_version", "Monterey");

		caps.setCapability("browser", "Chrome");

		caps.setCapability("browser_version", "98");

		String hubURL = "https://<account-id>:<accesskey>@hub-cloud.browserstack.com/wd/hub";
		
		WebDriver driver=null;
		try 
		{
			driver=new RemoteWebDriver(new URL(hubURL), caps);
		} catch (MalformedURLException e) {
			System.out.println("Connection failed with hub");
		}
		
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
		
		driver.quit();
	}

}
