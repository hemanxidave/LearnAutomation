package day11;

public class NotEligibleForVoteException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1768547163714895960L;

	public NotEligibleForVoteException(String msg)
	{
		super(msg);
	}
}
