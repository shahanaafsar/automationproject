package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Publications {

	WebDriver driver;
	public Publications(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[4]/a")
	WebElement publicat;
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/ol/li[3]/div/div/div[1]/a/span/span/img")
	WebElement product1;
	
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[1]/a")
	WebElement homepage;
	public void publicationclick()
	{
		
		publicat.click();
		Assert.assertEquals(driver.getTitle(), "Publications");
		product1.click();
		driver.navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("window.scrollBy(0,800)");
		 homepage.click();
		 
	}
	
}
