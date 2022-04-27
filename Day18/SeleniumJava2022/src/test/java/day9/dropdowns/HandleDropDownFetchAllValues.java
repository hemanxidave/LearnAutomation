package day9.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Helper;

public class HandleDropDownFetchAllValues {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
	 	WebElement year=driver.findElement(By.name("birthday_year"));
		
	 	Select yearDD=new Select(year);
	 	
	    List<WebElement> allYearValues=yearDD.getOptions();
	    
	    System.out.println("Count of year dropdown values "+allYearValues.size());
	    
	    for(WebElement ele:allYearValues)
	    {
	    	System.out.println(ele.getText());
	    }
	    
	    Select monthDD=new Select(driver.findElement(By.id("month")));
	    
	    monthDD.selectByVisibleText("Oct");
	   
	    List<WebElement> allMonthValues=monthDD.getOptions();
	    
	
	    
	    for (WebElement month : allMonthValues) 
	    {
	    		String monthValue=month.getText();
	    		
	    		System.out.println("Month value is "+monthValue);
	    		
	    		if(monthValue.equalsIgnoreCase("Aug"))
	    		{
	    			System.out.println("Month present");
	    			break;
	    		}
	    	
		}
	   
	    System.out.println("Last selected value "+monthDD.getFirstSelectedOption().getText());
	    
	    
	}

}
