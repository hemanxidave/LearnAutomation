package day8.collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
	
		obj1.add(12);
		obj1.add(12.85);
		obj1.add("Masrura");
		obj1.add("Masrura");
		obj1.add("Pooja");
		obj1.add(true);
		obj1.add(null);
		obj1.add(null);
		
		System.out.println(obj1);
		System.out.println(obj1.get(1));
		System.out.println(obj1.contains(12));
		System.out.println(obj1.remove(0));
		System.out.println(obj1);
		
		
		System.out.println("Basic for loop");
		
		for(int i=0;i<obj1.size();i++)
		{
			System.out.println(obj1.get(i));
		}
		
		System.out.println("Enhanced for loop");
		
		for(Object o1:obj1)
		{
			System.out.println(o1);
		}
		
		
		ArrayList obj2=new ArrayList();
		obj2.add("Anshu");
		obj2.add("Vickey");
		obj2.add("Anshu");
		
		System.out.println("Second arraylist "+obj2);
		
		obj1.addAll(obj2);
		
		System.out.println("Final list "+obj1);
		
	}

}
