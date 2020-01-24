package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {
		WebDriver driver;
		@Test
		public void startapp()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
			
			System.out.println("Start Application:");
		}
		
		@Test(dependsOnMethods="startapp")
		public void checktitle()
		{
			driver.findElement(By.id("Email")).sendKeys("rapoleraghu@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Raghu@1995");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			String expectedname="Demo Web Shop";
			
			String actualname=driver.getTitle();
			System.out.println(actualname);
			Assert.assertEquals(expectedname, actualname);
			driver.findElement(By.linkText("Log out")).click();
			System.out.println("Log out of application");
		}
		
		
}
