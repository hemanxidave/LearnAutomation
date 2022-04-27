package day17;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{
	
	@Parameters({"Browser","url"})
	@Test
	public void startBrowser(@Optional("Edge") String browser,@Optional("http://learn-automation.com") String url)
	{
		System.out.println("Browser name is "+browser);
		System.out.println("URL is "+url);
	}

}
