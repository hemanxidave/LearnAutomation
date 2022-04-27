package day11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class AlertDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver=Helper.startBrowser("Chrome");

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Alert alt= driver.switchTo().alert();
		
		driver.findElement(By.name("proceed")).click();
		
		Helper.waitForElement(3);
		
		String alt_text=alt.getText();
		
		System.out.println("Alert text is "+alt_text);
		
		alt.accept();
		
		// click on second option/no/cancel
		//alt.dismiss();
		
		// enter is alert prompt box	
		//alt.sendKeys("");
		
		driver.findElement(By.name("login")).sendKeys("mukesh@gmail.com");
		
		
	}

}
