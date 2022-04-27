package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo5 {

	public static void main(String[] args) {
		
		Map<String, Object> s1=new HashMap<String, Object>();
		s1.put("Name", "Mukesh");
		s1.put("Gender", 'M');
		s1.put("Phone", 12121212);
		s1.put("Status", true);
		
		Map<String, Object> s2=new HashMap<String, Object>();
		s2.put("Name", "Amit");
		s2.put("Gender", 'M');
		s2.put("Phone", 787878);
		s2.put("Status", false);
		
		
		Map<String, Object> s3=new HashMap<String, Object>();
		s3.put("Name", "Kalyan");
		s3.put("Gender", 'M');
		s3.put("Phone", 89899);
		s3.put("Status", false);
		
		
		List<String> l1=new ArrayList<String>();
		l1.add("Selenium");
		
		List<Map<String, Object>> myStudents=new ArrayList<Map<String,Object>>();
	
		myStudents.add(s1);

		myStudents.add(s2);
		
		myStudents.add(s3);
		
		System.out.println(myStudents.get(2).get("Phone"));
		
		
	}

}
