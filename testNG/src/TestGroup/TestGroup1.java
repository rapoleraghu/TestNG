package TestGroup;

import org.testng.annotations.Test;

public class TestGroup1 {

		@Test(groups={"Smoke"})
		public void test1()
		{
			System.out.println("Smoke1 testing");
		}
		
		@Test(groups={"Smoke"})
		public void test2()
		{
			System.out.println("Smoke2 testing");
		}
		
		@Test(groups={"Smoke"})
		public void test3()
		{
			System.out.println("Smoke3 Testing");
		}
		
		@Test(groups={"Regression"})
		public void test4()
		{
			System.out.println("Regression1 testing");
		}
		
}
