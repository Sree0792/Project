package firstseleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbuttontextpgm {

	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test1()
	{
	driver.get(baseurl);	
	
	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	String buttontext=button.getAttribute("value");
	String exp="Check availability";
	if(buttontext.equals(exp))
	{
		System.out.println("button is expected");
	}
	
	else
	{
		System.out.println("not expected");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
