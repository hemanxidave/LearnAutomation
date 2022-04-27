package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig 
{
	
	@Test
	public void readData() throws IOException
	{
		File src=new File(System.getProperty("user.dir")+"/Config/Config.properties");
		
		FileInputStream fis=new FileInputStream(src);
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("browser"));
		
		System.out.println(pro.getProperty("qaUrl"));
		
		System.out.println(pro.getProperty("toolName"));
		
		
	}

}
