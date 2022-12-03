package testPackage;

import org.testng.annotations.Test;

public class TestClass 
{
	@Test(priority=1,enabled=true,description="this method is doing additions")
	
		void add() 
		{
			System.out.println("addition");
		}
	@Test(priority=-2,enabled=true,description="this method is doing subtraction")
	void sub() 
	{
		System.out.println("subtract");
	}
	
	@Test(priority=8)
	void bore()
	{
		throw new ArithmeticException();
		
	}
	
}
