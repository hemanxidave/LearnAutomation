package day5_inheritance;

public class IDFCFirstBank extends Bank {

	public static void main(String[] args) {
		
		// Scenario 1 - Creating object of child class and reference of child class
		IDFCFirstBank idfc=new IDFCFirstBank();
		
		System.out.println("Int rate for home loan is "+idfc.int_rate);
		
		idfc.openAccount();
		
		idfc.depo();
		
		idfc.with();
		
		idfc.closeAccount();
		
		
		// Scenario 2 - Creating object of base class and reference of base class
		Bank b1=new Bank();
		b1.openAccount();
		b1.closeAccount();
		
		//Scenario 3 - Creating object of child class and reference of base class
		Bank b2=new IDFCFirstBank();
		b2.openAccount();
		b2.closeAccount();
	
		// reference matters 
		Object b3=new IDFCFirstBank();
		
		// not valid
		//IDFCFirstBank idfcnew=new Bank();
		
		

	}

	public void depo()
	{
			System.out.println("Bank allows customer to depo");
	}
	
	public void with()
	{
		System.out.println("Bank allows customer to with amount 24*7");
	}
	
	
}
