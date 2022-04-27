package day8.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		
		
		List<List<String>> myStudents=new ArrayList<List<String>>();
		
		List<String>batch1=new ArrayList<String>();
		batch1.add("Dina");
		batch1.add("Parveen");
		
		List<String>batch2=new ArrayList<String>();
		batch2.add("Meenakshi");
		batch2.add("Pritesh");
		
		List<String>batch3=new ArrayList<String>();
		batch3.add("Aya");
		batch3.add("Shahu");
	
		myStudents.add(batch1);
		myStudents.add(batch2);
		myStudents.add(batch3);
		
		System.out.println(myStudents);
			
		System.out.println(myStudents.get(2).get(1));
		//System.out.println(myStudents.get(2).get(batch3.size()-1));
		
	}

}
