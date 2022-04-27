package day14;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> m1=new HashMap<String, String>();
		
		m1.put("Automation", null);
		
		m1.put("Alisha", null);
		
		m1.put("Build", "Maven");
		
		m1.put("Old Build Tool", "Ant");
		
		m1.put("CI", "Jenkins");
		
		m1.put("CI", "Teamcity");
		
		m1.put("UnitTestFramework", "TestNg");
		
		System.out.println(m1);
		
		System.out.println(m1.get("CI"));
		
		System.out.println(m1.containsKey("Aya"));
		
		System.out.println(m1.containsValue("Selenium"));
		
	}

}
