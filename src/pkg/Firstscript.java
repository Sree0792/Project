package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	String actualtitle=driver.getTitle();	
	String exp="Google";
	if(actualtitle.equals(exp))	
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}

}
