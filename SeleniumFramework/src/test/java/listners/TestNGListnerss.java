package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNGListnerss implements ITestListener {

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println(result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println(result.getName());
		
	}

}
