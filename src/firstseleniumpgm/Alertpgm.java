package firstseleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	
	
	String baseurl="file:///C:/Users/LENOVO/Documents/alert.html";
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test3()
	{
	driver.get(baseurl);
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println(alerttext);
	a.accept();
	//a.dismiss();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	
	}
			
}
