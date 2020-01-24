package testNGPackage;

import org.testng.annotations.Test;

public class DependsonMethodsDemo {

	@Test
	public void startapp()
	{
		System.out.println("Start Application:");
	}
	
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("Login to application:");
	}
	
	@Test(dependsOnMethods="login")
	public void logoff()
	{
		System.out.println("Logout of application");
	}
}
