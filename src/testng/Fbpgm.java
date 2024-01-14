package testng;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fbpgm {

	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();	
	}
		@BeforeMethod
		public void loadurl()
		{
			driver.get("https://www.facebook.com");
		}
		@Parameters({"un","pswd"})
		
		@Test
		public void test1(String un,String pswd)
		{
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pswd);	
		
		
		}
		
	
	
	
}
