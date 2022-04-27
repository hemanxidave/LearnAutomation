package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		try 
		{
			System.out.println("Please enter first number ");
			num1=sc.nextInt();
			System.out.println("Please enter second number ");
			num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("Result is "+result);
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please enter only integer numbers");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please dont enter zero");
			System.out.println("Exception is "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong please try again");
		}
		catch(Throwable e)
		{
			System.out.println("Something went wrong please try again");
		}
		finally 
		{
			sc.close();
			System.out.println("Closing connection");
		}
	}

}
