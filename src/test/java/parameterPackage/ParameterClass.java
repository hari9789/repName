package parameterPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass 
{
@Test
@Parameters("myname")
public void parameterTest(String myname)
{
	System.out.println("parameterized value is:"+myname);
}
}
