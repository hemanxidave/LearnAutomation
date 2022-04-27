package day11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class AlertDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Try it']"));
		
		/*
		 * System.out.println(element.isDisplayed());
		 * System.out.println(element.isEnabled());
		 * System.out.println(element.getAttribute("name"));
		 */
		
		//new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
	
		for(int i=0;i<20;i++)
		{
			try 
			{
				Alert alt=driver.switchTo().alert();
				System.out.println("Alert found");
				System.out.println(alt.getText());
				alt.accept();
				break;
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Waiting for alert count "+i);
			}
			Helper.waitForElement(1);
		}
		
		
	}

}
