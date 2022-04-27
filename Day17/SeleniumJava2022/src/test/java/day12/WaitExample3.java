package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample3 {

	/*
	 * 		How to switch to next window without title without index
	 * 
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		/*
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// TimeoutException if condition is not completed within time frame
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		
		alt.accept();
		*/
		
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent()).accept();
		
		
	}

}
