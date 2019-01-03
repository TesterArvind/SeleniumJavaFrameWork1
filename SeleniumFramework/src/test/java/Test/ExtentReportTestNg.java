package Test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNg {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeTest
	public void setUp() {
		htmlReporter= new ExtentHtmlReporter("Extent.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@Test
	public void test1() {
		ExtentTest test = extent.createTest("MyFirst","SampleDescription");
		test.log(Status.PASS, "pass");
		test.pass("pass");

		//		test.pass(Status.FAIL, "fail");
		test.pass("fail");

	}
	@AfterTest
	public void tearDown() {
		extent.flush();

	}
}
