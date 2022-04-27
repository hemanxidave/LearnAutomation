package day8.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		list1.add("Selenium");
		list1.add("Java");
		System.out.println(list1);
		
		List<String> l1=new ArrayList<String>(list1);
		l1.add("TestNG");
		l1.add("Jenkins");
		System.out.println(l1);	
		
		String name="Damodar";
		
		System.out.println(name.charAt(58));
		
	}

}
