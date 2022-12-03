package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void Test2()
	{
		//System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
