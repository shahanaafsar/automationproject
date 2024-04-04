package pagepkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Contactus {

	
	
	WebDriver driver;
	public Contactus(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[5]/a")
	WebElement contact ;
	@FindBy(xpath="/html/body/div[1]/footer/div/div[2]/div/div/div/div[1]/div[2]/ul/li[1]/a")
	WebElement about;
	public void contactpage()
	{
		contact.click();
		Assert.assertEquals(driver.getTitle(), "Contact Us");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("window.scrollBy(0,1000)");
		 about.click();
		 
	}
}
