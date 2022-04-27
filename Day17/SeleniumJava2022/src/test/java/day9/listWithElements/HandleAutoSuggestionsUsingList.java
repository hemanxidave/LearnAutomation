package day9.listWithElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class HandleAutoSuggestionsUsingList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		
		driver.findElement(By.id("tags")).sendKeys("S");
		
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
	    
		for(WebElement ele:allSuggestions)
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("Selenium"))
			{
				ele.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		//driver.quit();
		
	    
	}

}
