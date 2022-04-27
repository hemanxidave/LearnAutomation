package day14;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassDemo6 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Batch Recordings\\Selenium Jan 2022\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> myMap = new HashMap<String, Object>();

		myMap.put("download.default_directory", "C:\\Batch Recordings\\Selenium Jan 2022");

		options.setExperimentalOption("prefs", myMap);
		
		WebDriver driver=new ChromeDriver(options);	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

}
