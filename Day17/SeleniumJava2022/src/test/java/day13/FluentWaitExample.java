package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import utility.Helper;

public class FluentWaitExample {

	public static void main(String[] args) {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

		wait.withTimeout(Duration.ofSeconds(10));

		wait.pollingEvery(Duration.ofMillis(100));

		wait.ignoring(NoSuchElementException.class);

		WebElement ele=	wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver lDriver) {

				WebElement element = lDriver.findElement(By.xpath("//p[@id='demo']"));
				
				String eleText=element.getText();

				if (eleText.equalsIgnoreCase("WebDriver")) 
				{
					System.out.println("text found");
					return element;
				} 
				else 
				{
					System.out.println("Still waiting - Current text is "+eleText);
					return null;
				}

			}

		});
	
		System.out.println("Element Display status "+ele.isDisplayed());

	}

}
