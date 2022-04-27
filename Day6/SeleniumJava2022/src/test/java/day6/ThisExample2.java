package day6;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThisExample2 
{
	
	/*
	 * 
	 * 		calling current class constructor
	 * 		
	 * 
	 */
	
		public ThisExample2()
		{
			this("Selenium");
			System.out.println("Default cons");
		}
		
		public ThisExample2(String name)
		{
			this(2);
			System.out.println("Cons with single argument "+name);
		}
		
		public ThisExample2(double num)
		{
			System.out.println("Cons with single int argument "+num);
		}
	
		public static void main(String[] args) {
	
		ThisExample2 s1=new ThisExample2();
		
		ChromeDriver driver=new ChromeDriver();
		
		
	}
	
}
