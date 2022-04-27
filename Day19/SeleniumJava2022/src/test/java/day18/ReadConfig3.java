package day18;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ConfigUtlity;

public class ReadConfig3 
{
	
	@Test
	public void readData() throws IOException
	{
		System.out.println(ConfigUtlity.getValue("browser"));
		
		System.out.println(ConfigUtlity.getValue("qaUrl"));
		
		System.out.println(ConfigUtlity.getValue("accessKey"));
		
		
	}

}
