package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass4 
{
	@Test
	public void test4()
	{
		//System.out.println("morning");
		System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
