package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

	String baseurl="https://www.google.com";
	ChromeDriver driver;
	
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		
	}
	@Test
	public void test1()
	{
		driver.get(baseurl);
		
		String actualtitle=driver.getTitle();	
		String exp="Google";
		if(actualtitle.equals(exp))	
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		}
	


@After
public void teardown()
{
	driver.quit();
	
}
}
