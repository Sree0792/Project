package firstseleniumpgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkacnt {

	
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		
	
	driver=new ChromeDriver();
	driver.get(baseurl);
	
	}
	
	@Test
	public void test2()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("tot no of links="+li.size());
	}
}
