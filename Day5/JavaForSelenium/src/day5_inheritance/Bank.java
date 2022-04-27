package day5_inheritance;

public class Bank extends RBI
{
	
	public Bank()
	{
		System.out.println("Welcome to banking services");
	}
	
	public Bank(String name)
	{
		System.out.println("Hello "+ name +" Welcome to banking services");
	}
	
	public int int_rate=8;
	
	public void openAccount()
	{
		System.out.println("Customer can open account using phone number");
	}
	
	public void closeAccount()
	{
		System.out.println("Customer now can close account just from application");
	}
	
	public void depo()
	{
			System.out.println("Customer can only deposit money if they have valid source");
	}
	
}
