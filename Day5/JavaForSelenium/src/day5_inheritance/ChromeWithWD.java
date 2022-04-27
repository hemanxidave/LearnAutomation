package day5_inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeWithWD {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.quit();
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Batch Recordings\\Selenium Jan 2022\\geckodriver.exe");
		
		WebDriver driver1=new FirefoxDriver();
		
		driver1.get("http://www.yahoo.com");
		
		driver1.quit();
		
		
		System.setProperty("webdriver.edge.driver","C:\\Batch Recordings\\Selenium Jan 2022\\msedgedriver.exe");

		WebDriver driver2=new EdgeDriver();
		
		driver2.get("http://www.twitter.com");
		
		driver2.quit();

	}

}
