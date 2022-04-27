package day17;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class AssertionDemo 
{
	
	@Test
	public void test1()
	{
		Reporter.log("Start", true);
		
		Assert.assertEquals(true, true,"Title did not match");
		
		Reporter.log("End", true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(12,13,"Count mismatch");		
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Mukesh","mukesh","String mismatch");		
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("Mukesh","Mukesh","String mismatch");		
	}
	

	@Test
	public void test5()
	{	
		List<String> myList1=Arrays.asList("Selenium","Java","TestNG");
		List<String> myList2=Arrays.asList("Selenium","Java","TestNG");
		
		Assert.assertEquals(myList1,myList2,"List mismatch");		
	}
	

	@Test
	public void test6()
	{	
		Assert.assertFalse(false);
	}
	
	@Test
	public void test7()
	{	
		String error_message="enter your password";
		String actual_error="Please enter your password";
		Assert.assertTrue(actual_error.contains(error_message),"error message did not match");
	}
	
	@Test
	public void test8()
	{	
		Assert.assertTrue(30<40);
		
		 
		
	}
	
	
	

}
