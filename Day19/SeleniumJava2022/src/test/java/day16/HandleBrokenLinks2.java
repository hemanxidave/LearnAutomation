package day16;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class HandleBrokenLinks2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = Helper.startBrowser("Chrome");

		driver.get("https://www.naukri.com/");
				
		List<WebElement> allLinks=driver.findElements(By.xpath("//a[@href]"));
		
		ArrayList<String> allBrokenLinks=brokenLinkChecker(allLinks);
		
		if(allBrokenLinks.size()==0)
		{
			System.out.println("Test Passed No Broken Links Found");
		}
		else
		{
			System.out.println("Test Failed Total Broken links "+allBrokenLinks.size());
		
			for(String link:allBrokenLinks)
			{
				System.out.println("Links are "+link);
			}
			
		}
		
		
		
	}
	
	
	
	
	public static ArrayList<String> brokenLinkChecker(List<WebElement> allLinks) {
		
		ArrayList<String> brokenLinks=new ArrayList<String>(); 
		
		
		for(WebElement ele:allLinks)
		{
				String href=ele.getAttribute("href");
				
				try 
				{
					URL url = new URL(href);

					HttpURLConnection connection = (HttpURLConnection) url.openConnection();

					connection.setConnectTimeout(5000);
					
					connection.connect();

					int code = connection.getResponseCode();

					if (code < 400) 
					{
						System.out.println("Link working - Status Code "+ code  +" -URL " + url + " Status " + connection.getResponseMessage());
					} else 
					{
						System.out.println("Link Broken - Status Code "+ code  +"- URL " + url + " Status " + connection.getResponseMessage());
						brokenLinks.add(href);
					}
				} catch (MalformedURLException e) {
					System.out.println("URL not formatted " + e.getMessage());
					brokenLinks.add(href);
				} catch (IOException e) {
					System.out.println("Connection Failed " + e.getMessage());
					brokenLinks.add(href);
				} catch (Exception e) {
					System.out.println("Something went wrong " + e.getMessage());
					brokenLinks.add(href);
				}
				
		}
		
		return brokenLinks;
		
		
		
	}

	public static void brokenLinkChecker(String urlToCheck) {
		
		try 
		{
			URL url = new URL(urlToCheck);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.connect();

			int code = connection.getResponseCode();

			if (code < 400) 
			{
				System.out.println("Link working - Status Code "+ code  +" -URL " + url + " Status " + connection.getResponseMessage());
			} else 
			{
				System.out.println("Link Broken - Status Code "+ code  +"- URL " + url + " Status " + connection.getResponseMessage());
			}
		} catch (MalformedURLException e) {

			System.out.println("URL not formatted " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Connection Failed " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Something went wrong " + e.getMessage());
		}
	}

}
