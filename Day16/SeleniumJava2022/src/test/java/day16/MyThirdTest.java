package day16;

import org.testng.annotations.Test;

public class MyThirdTest 
{
	
	
	@Test(description = "logout test",priority = 2)
	public void logout()
	{
		System.out.println("Logout");
	}
	
	
	@Test(description = "Add items to cart",priority = 1)
	public void addToCart()
	{
		System.out.println("added items to cart");
	}
	
	@Test(description = "Login test",priority = 0)
	public void loginToApplication()
	{
		System.out.println("Login as admin");
	}
	
	

}
