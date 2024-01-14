package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatrpgm {
	
	ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
	 
 }
@Test
public void loctrprgm()
{
	driver.get("https://www.facebook.com");
	
	
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("abc123");
	driver.findElement(By.name("pass")).click();
	
	
}

}
