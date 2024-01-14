package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	//@beforesuite
	//@beforeclass
    //@beforetest
    //@beforemethod
    //@test


@BeforeTest//(alwaysRun=true)
public void setup()
{
	System.out.println("browser open");
}


@BeforeMethod
public void urlloading()
{
	System.out.println("url loading");
}

@Test(priority=0,groups={"smoke"})
public void titleverification()
{
	System.out.println("title verification");
}

@Test(priority=2,groups={"smoke"})
public void pagesrcverification()
{
	System.out.println("pagesrcverification");
}


@Test(priority=1,groups= {"sanity"})
public void Logodisplay()
{
	System.out.println("logo display");
}

@Test(groups= {"sanity"})
public void test1()
{
System.out.println("test1");	
}


@Test(groups= {"smoke","regression"})
public void test2()
{
	System.out.println("test2");
}
@AfterMethod
public void aftermthd()
{
	System.out.println("after method");
}

@AfterTest
public void tearDown()
{
	System.out.println("browser close");
}
}
