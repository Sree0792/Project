package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demogurupgm {
	
	
	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();	
	}
		@BeforeMethod
		public void loadurl()
		{
			driver.get(baseurl);
		}
		
		
		@Test
		public void test1()
		{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("E:\\vap mlpsry.docx");
		
		
		
		
		
		
		//check the "I accept the terms of service" check box
        //driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        //driver.findElement(By.name("submit file")).click();
		}
		
	
	
	
	
	
	
	

}
