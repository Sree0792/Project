package testng;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	
	
	@Parameters({"v","num"})

	@Test
	public void titleverification(String v,String num)
	{
	System.out.println(v);	
	System.out.println(num);
	}
	
	
	
	
	
	

}
