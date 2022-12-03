package grouppackage;

import org.testng.annotations.Test;

public class GroupClasss 
{
	@Test(groups= {"demo"})
	void test1()
	{
		System.out.println("basic annotations-test1");
	}
	@Test(groups= {"hari"})
	void test2()
	{
		System.out.println("basic annotations-test2");
	}
	@Test(groups= {"hari"})
	void test3()
	{
		System.out.println("nothing-test3");
	}
}
