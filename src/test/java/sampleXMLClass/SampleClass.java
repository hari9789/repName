package sampleXMLClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass 
{
	public static WebDriver driver;
@Test
	public void driverLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drive\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canadadrives.ca/");
	}
}