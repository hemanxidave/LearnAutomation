package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ConfigUtlity;
import utility.Helper;

public class DDTWithSelenium2 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=Helper.startBrowser(ConfigUtlity.getValue("browser"));
		
		driver.get(ConfigUtlity.getValue("qaUrl"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		Helper.closeBrowser(driver);
	}
	
	
	@Test(dataProvider = "login")
	public void logins(String uname,String pass)
	{
		WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys(uname);

		driver.findElement(By.name("txtPassword")).sendKeys(pass);

		driver.findElement(By.className("button")).click();

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login failed");
		
		driver.findElement(By.id("welcome")).click();

		try 
		{
			driver.findElement(By.linkText("Logout")).click();
			
		} catch (Exception e) 
		{
			System.out.println("Click on logout failed "+e.getMessage());
			System.out.println("Trying again");
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
		}

		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout failed");
	}
	
	@DataProvider(name="login")
	public Object[][] getData() throws IOException
	{
	
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));
		
		XSSFSheet sh1=wb.getSheet("LoginData");

		int row=sh1.getPhysicalNumberOfRows();
		
		int column=sh1.getRow(0).getPhysicalNumberOfCells();
		
		Object [][]arr=new Object[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sh1.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		
		wb.close();
	
		return arr;
	}
	
	
}
