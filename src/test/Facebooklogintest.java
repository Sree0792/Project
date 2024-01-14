package test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Facebookloginpage;
import basepkg.Baseclass;

public class Facebooklogintest extends Baseclass {
	

	@Test
	public void testlogin()
	{
		Facebookloginpage ob=new Facebookloginpage(driver);
		ob.setValues("abc@gmail.com", "abc345");
		ob.loginClick();
		driver.navigate().back();
	
	
	
	
	}
	
	
	
	
	

}
