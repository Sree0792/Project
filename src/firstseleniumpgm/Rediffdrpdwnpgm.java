package firstseleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdrpdwnpgm {
	

	
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
	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
	
	
WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select daydetail=new Select(day);
daydetail.selectByValue("01");
WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select monthdetail=new Select(month);
monthdetail.selectByVisibleText("JAN");
WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
Select yeardetail=new Select(year);
yeardetail.selectByValue("1990");
}
}