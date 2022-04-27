package day18;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT 
{
	
	@Test(dataProvider = "login")
	public void logins(String uname,String pass)
	{
		System.out.println("Username "+uname);
		System.out.println("Password "+pass);
	}
	
	@DataProvider(name="login")
	public Object[][] getData()
	{
		Object [][]arr=new Object[3][2];
		arr[0][0]="Amit";
		arr[0][1]="Sandhya";
		arr[1][0]="Dinakaran";
		arr[1][1]="Shahu";
		arr[2][0]="Krish";
		arr[2][1]="Divya";
		
		return arr;
	}
	
	
}
