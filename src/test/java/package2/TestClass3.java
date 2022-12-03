package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass3 
{
	@Test
	public void Test3()
	{
		//System.out.println("good");
		System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
