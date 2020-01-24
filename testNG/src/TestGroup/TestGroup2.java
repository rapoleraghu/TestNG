package TestGroup;

import org.testng.annotations.Test;

public class TestGroup2 {
	
	
	@Test(groups={"Regression"})
	public void test5()
	{
		System.out.println("Regression2 Testing");
	}
	
	@Test(groups={"Regression"})
	public void test6()
	{
		System.out.println("Regression3 Testing");
	}
	
	@Test(groups={"Smoke"})
	public void test7()
	{
		System.out.println("Smoke4 Testing");
	}
	
	@Test(groups={"Regression"})
	public void test8()
	{
		System.out.println("Regression4 Testing");
	}
}
