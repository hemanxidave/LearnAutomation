package day8.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample3 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// findElement -single,nosuchelementexception,perform operation on first element
		// findElements -List,size 0, you need to tell which index to use
	
		List<WebElement> allElements=driver.findElements(By.id("Hemankshi"));

		System.out.println(allElements.size());
		
		driver.findElement(By.tagName("a")).click();
		
		driver.findElements(By.tagName("a")).get(3).click();
		
		driver.findElements(By.tagName("a")).get(4).click();
	
	}

}
