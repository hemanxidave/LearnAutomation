package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OptionsClassDemo2 {

	public static void main(String[] args) {
		
	  //WebDriver driver=Helper.startBrowser("Chrome");
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.acceptInsecureCerts();
		
		WebDriver driver=new ChromeDriver(cap);	
		
		driver.get("https://www.cacert.org/");

	}

}
