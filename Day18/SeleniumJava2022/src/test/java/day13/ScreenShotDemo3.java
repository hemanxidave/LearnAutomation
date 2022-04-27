package day13;

import org.openqa.selenium.WebDriver;

import utility.Helper;

public class ScreenShotDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html");
		
		//AShot- Explore
		Helper.captureScreenshot(driver);
		
		driver.quit();
	}

}
