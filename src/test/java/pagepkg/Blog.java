package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Blog {
	WebDriver driver;
	public Blog(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[6]/a")
	WebElement blog ;
	

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/ol/li[2]/div/div[1]/div/a/img")
	WebElement joint ;
	
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[1]/a")
	WebElement homepage;
	public void blogop()
	{
		blog.click();
		Assert.assertEquals(driver.getTitle(), "Blogs");
		joint.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("window.scrollBy(0,800)");
		 homepage.click();
	}
}
