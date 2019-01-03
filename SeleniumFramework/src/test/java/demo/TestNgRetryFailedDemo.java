package demo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNgRetryFailedDemo {
	
	@Test
	public void test1() {
		System.out.println("hi1");
	}
	@Test
	public void test2() {
		System.out.println("hi2");
	
	}
	
	@Test
	public void test3() {
		System.out.println("hi3");
		Assert.assertTrue(false);
		
		
	}

}
