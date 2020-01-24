package testNGPackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {

	@BeforeSuite
	public void  setProperty()
	{
		System.out.println("Set the diver path");
	}
	
	@BeforeTest
	public void openchrome()
	{
		System.out.println("Open chrome");
	}
	@BeforeClass
	public void gettitle()
	{
		System.out.println("Application");
	}
	
	@BeforeMethod
	public void checktitle()
	{
		System.out.println("checktitle");
	}
	@Test
	public void viewtitle()
	{
		System.out.println("Display Title");
	}
	
	@AfterMethod
	public void login()
	{
		System.out.println("Login to test");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("Logout to test");
	}
	
	@AfterTest
	public void closebrowser()
	{
		System.out.println("close browser");
	}
}
