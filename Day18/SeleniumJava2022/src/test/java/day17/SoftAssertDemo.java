package day17;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	
	@Test
	public void test1()
	{
	
		SoftAssert softAssert=new SoftAssert();
		
		Reporter.log("Login", true);
		
		softAssert.assertEquals(12, 16);
		
		Reporter.log("Logout", true);
		
		softAssert.assertEquals(12, 16);
		
		Reporter.log("Logout1", true);
		
		softAssert.assertEquals(12, 16);
		
		Reporter.log("Logout2", true);
		
		softAssert.assertEquals(12, 16);
		
		Reporter.log("Logout3", true);
		
		softAssert.assertAll();
	
	}

}
