package ffdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FFDemo1 {

	public static void main(String[] args) throws MalformedURLException {
		
		  final String AUTOMATE_USERNAME = "mukeshotwani_p5NVfe";
		  final String AUTOMATE_ACCESS_KEY = "5ZAx21YD45weRsZSecRy";
		  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		
		  
		  	FirefoxOptions fo=new FirefoxOptions();
		  
		  	
		    //DesiredCapabilities caps = new DesiredCapabilities();
		    fo.setCapability("os_version", "Monterey");
		    fo.setCapability("browser", "Firefox");
		    fo.setCapability("browser_version", "83.0");
		    fo.setCapability("os","OS X");
		    WebDriver driver = new RemoteWebDriver(new URL(URL), fo);
		   
		    driver.get("http://learn-automation.com");
		    
		    System.out.println(driver.getTitle());
		    
		    driver.quit();
		   
		

	}

}
