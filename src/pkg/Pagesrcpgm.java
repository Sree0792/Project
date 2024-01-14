package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrcpgm { 
	ChromeDriver driver; 
	
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		
	}
	
	
@Test
public void pagesrcverfctn()
{
	driver.get("https://www.google.com");
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}




}



}