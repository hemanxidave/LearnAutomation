package day5_inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumTest2Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.uninstallExtension("");
	
		
		WebDriver driverNew=new ChromeDriver();	
		WebDriver driverNew1=new FirefoxDriver();
		WebDriver driverNew2=new EdgeDriver();
		WebDriver driverNew3=new SafariDriver();
		


	}

}
