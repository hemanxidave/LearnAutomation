package day9.setExample;

import java.util.HashSet;

public class SetExamples2 {

	public static void main(String[] args) {
		
		HashSet<String>names=new HashSet<String>();
		names.add("Selenium");
		names.add("Jenkins");
		names.add("Amit");
		names.add("Amit");
		names.add("Sunil");
		names.add("Anshu");
	
		System.out.println(names.contains("Selenium"));
		
		System.out.println(names.remove("Amit"));
		
		System.out.println(names.isEmpty());
		
		System.out.println(names.size());
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
	}

}
