package firstseleniumpgm;


	

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Rediffbuttonpgm {
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			//driver.get(baseurl);
		}
		
		@Test
		public void test1()
		
		{
	driver.get(baseurl);
		
	 boolean button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isDisplayed();

	if(button)
	{
		System.out.println("selected button");
	}
	else
	{
		System.out.println("not selected");
	}
		
	}	
		
		
	}