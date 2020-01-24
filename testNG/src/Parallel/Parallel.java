package Parallel;


	

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class Parallel {
		WebDriver driver;
		@Test
		public void method()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("samreen");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			
			driver.findElement(By.linkText("Log out")).click();
				System.out.println("logout to application");
		}
				WebDriver driver1;
			@Test
		public void method1()
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver1=new FirefoxDriver();
			driver1.get("http://demowebshop.tricentis.com/login");
			driver1.manage().window().maximize();
			driver1.findElement(By.id("Email")).sendKeys("samreen@gmail.com");
			driver1.findElement(By.name("Password")).sendKeys("samreen");
			driver1.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			
			driver1.findElement(By.linkText("Log out")).click();
				System.out.println("logout to application");
		}
		

	}


