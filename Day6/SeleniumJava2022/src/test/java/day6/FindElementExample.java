package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

	public static void main(String[] args) 
	{

		/*
		 * ChromeDriver driver=new ChromeDriver();
		 * 
		 * RemoteWebDriver driver2=new ChromeDriver();
		 * 
		 * WebDriver driver3=new ChromeDriver();
		 * 
		 * SearchContext driver4=new ChromeDriver();
		 * 
		 * Object driver5=new ChromeDriver();
		 * 
		 * //WebDriver driver=new RemoteWebDriver(null, null);
		 */	
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		/*
		 * Options opt= driver.manage();
		 * 
		 * Window win=opt.window();
		 * 
		 * win.maximize();
		 */
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.isDisplayed());

		System.out.println(username.isEnabled());
		
		System.out.println(username.getTagName());
			
		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.className("button")).click();
	
	}

}
