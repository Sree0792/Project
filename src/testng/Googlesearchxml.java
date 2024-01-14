package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Googlesearchxml {

	ChromeDriver driver;
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();	
}
	@BeforeMethod
	public void loadurl()
	{
		driver.get("https://www.google.com");
	}
	@Parameters({"v"})
	
	@Test
	public void test1(String v)
	{
	driver.findElement(By.name("q")).sendKeys(v,Keys.ENTER);	
	
	}
	
	
	
	
	
}
