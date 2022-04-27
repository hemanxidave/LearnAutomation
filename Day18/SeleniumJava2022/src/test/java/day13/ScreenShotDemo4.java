package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class ScreenShotDemo4 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//button[contains(text(),'	Search for Bus')]")).click();
		
		// take screenshot of alert 
		Helper.captureScreenshot(driver);
		
		driver.quit();
	}

}
