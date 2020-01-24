package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGooglePageTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle()
	{
		String title=driver.getTitle();
		String expectedtitle="google";
		Assert.assertEquals(expectedtitle, title);
		
	}
	
	@Test(priority=1)
	public void checklogo()
	{
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@AfterMethod
	public void browserclose()
	{
		driver.quit();
	}
}
