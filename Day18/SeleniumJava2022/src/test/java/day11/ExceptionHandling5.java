package day11;

public class ExceptionHandling5 {

	public static void main(String[] args) throws InterruptedException, NotEligibleForVoteException {
		
		int age=21;
		
		if(age<18)
		{
			throw new NotEligibleForVoteException("Please apply after 18");
		}
		else
		{
			System.out.println("Please fill the form");
			
		}
	
	}

}
