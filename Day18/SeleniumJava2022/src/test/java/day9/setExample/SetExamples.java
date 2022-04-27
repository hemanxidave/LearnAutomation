package day9.setExample;

import java.util.HashSet;

public class SetExamples {

	public static void main(String[] args) {
		
		/*
		 *  Set unordered 
		 *  Set does not allow duplicates
		 * 
		 */
	
		HashSet<String>names=new HashSet<String>();
		names.add("Selenium");
		names.add("Jenkins");
		names.add("Amit");
		names.add("Amit");
		names.add(null);
		names.add(null);
		names.add("Sunil");
		names.add("Anshu");
		
		System.out.println(names);
		

	}

}
