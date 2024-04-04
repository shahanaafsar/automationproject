package pagepkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Videoconsultation {

	WebDriver driver;
	public Videoconsultation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/div/div[1]/div[1]/div[3]/span/a")
	WebElement parenttitle;
	
	@FindBy(id="eveningBtn")
	WebElement eveningc;
	
	@FindBy(linkText="Dr. Ajith Kumar G")
	WebElement doctor;
	 public void videoconsultations() throws InterruptedException
	 {
		 String parentwindow=driver.getWindowHandle();
		
		parenttitle.click();
		
		System.out.println("parent title="+driver.getTitle());
		Set<String>allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		
			if(!handle.equals(parentwindow))
			{
				driver.switchTo().window(handle);
				
			}
		System.out.println("child title="+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		eveningc.click();

		doctor.click();
	    driver.close();
		
			
		driver.switchTo().window(parentwindow);
	 }
}
