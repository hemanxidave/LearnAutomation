package day9.setExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
	
		Set<String>names=new LinkedHashSet<String>();
		names.add("Selenium");
		names.add("Jenkins");
		names.add("Amit");
		names.add("Amit");
		names.add("Sunil");
		names.add("Anshu");
	
		System.out.println(names);
		
	}

}
