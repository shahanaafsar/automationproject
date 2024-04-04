package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Aryabase {

	
	
	protected WebDriver driver;

	String baseurl="https://shop.aryavaidyasala.com/";
	@BeforeTest
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20))	;
	}
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
}
