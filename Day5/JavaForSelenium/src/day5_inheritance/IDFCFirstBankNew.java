package day5_inheritance;

public class IDFCFirstBankNew extends Bank 
{
	
	public IDFCFirstBankNew()
	{
		System.out.println("Welcome to IDFC First Bank");
	}
			
	public static void main(String[] args) {
			
		IDFCFirstBankNew idfc=new IDFCFirstBankNew();
		/*
		 * idfc.depo(); idfc.kycValidate();
		 * 
		 * Bank b1=new IDFCFirstBankNew(); b1.depo(); b1.kycValidate();
		 * 
		 * RBI b2=new IDFCFirstBankNew(); b2.kycValidate();
		 */
		
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
