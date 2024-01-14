package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionpgm {

	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";

	ChromeDriver driver;
	
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	@Test
	public void test1()
	{
		driver.get(baseurl);
		String actualtitle=driver.getTitle();
		String exp="Guru99";
		
		
	
		//soft assertion
		//if(actualtitle.equals(exp))
		//{
			//System.out.println("pass");
			
		//}
	//else
	//{
		//System.out.println("fail");
	//}
	//System.out.println("title verified");
		
		
	//hard assertion
		Assert.assertEquals(actualtitle, exp,"title verification");
	System.out.println("title verified");
	
	}
	
	
	
}
