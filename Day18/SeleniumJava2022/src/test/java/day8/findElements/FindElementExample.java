package day8.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement ele:allLinks)
		{
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));
		}

		// Click on 4th link
		WebElement ele=allLinks.get(3);
		ele.click();

		// click on 6th link
		allLinks.get(2).click();
		
		// click on the last element
		allLinks.get(allLinks.size()-1).click();
	}

}
