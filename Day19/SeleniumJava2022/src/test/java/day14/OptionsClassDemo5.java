package day14;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassDemo5 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
	
		Proxy myProxy=new Proxy();
		
		myProxy.setHttpProxy("http://192.168.0.1:8080");
	
		opt.setProxy(myProxy);
		
		WebDriver driver=new ChromeDriver(opt);	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

}
