package testNGPackage;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test
	public void startapp()
	{
		System.out.println("Start Application:");
	}
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login to application:");
	}
	
	@Test(priority=2)
	public void logoff()
	{
		System.out.println("Logout of application");
	}
	
}
