package day9.setExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
	
		// Treeset implements NavigableSet which extends SortedSet interface which extends Set interface
		
		
		Set<String>names=new TreeSet<String>();
		names.add("Selenium");
		names.add("Jenkins");
		names.add("Amit");
		names.add("Amit");
		names.add("Sunil");
		names.add("Anshu");
		names.add("Zara");
		
		System.out.println(names);
		
	}

}
