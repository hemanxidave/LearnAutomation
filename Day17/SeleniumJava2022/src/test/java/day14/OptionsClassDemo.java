package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassDemo {

	public static void main(String[] args) {
		
	  //WebDriver driver=Helper.startBrowser("Chrome");
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(opt);	
		
		driver.get("https://www.cacert.org/");

	}

}
