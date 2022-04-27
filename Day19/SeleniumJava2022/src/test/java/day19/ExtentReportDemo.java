package day19;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo 
{
	
	@Test
	public void test1()
	{
		ExtentSparkReporter reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Automation1.html");
		
		reporter.config().setDocumentTitle("Automation Report");
		
		reporter.config().setReportName("UI Report");
		
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		
		ExtentTest tc1=report.createTest("LoginTest", "Login as admin");
		tc1.pass("Login done");
		
		
		ExtentTest tc2=report.createTest("LogoutTest", "Login as admin");
		tc2.info("Click on welcome");
		tc2.pass("Click On Logout");
		tc2.fail("Logout failed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\l\\Desktop\\webinar.PNG").build());
		
		
		ExtentTest tc3=report.createTest("Payment", "Login as admin");
		tc3.skip("Payment Skipped");
		
		report.flush();
		
	}

}
