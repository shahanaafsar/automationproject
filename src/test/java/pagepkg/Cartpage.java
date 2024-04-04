package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cartpage {
	WebDriver driver;


	@FindBy(xpath ="/html/body/div[1]/header/div[1]/div/div/div[1]/div[2]/div/div/a/span[2]/span[1]")
			WebElement cart;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[1]/ul/li/button/span")
	WebElement checkout;
	
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[1]/ul/li/button")
	WebElement checkout2;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(xpath="//*[@id=\"QTJ3JLS\"]")
	WebElement adress;
	
	@FindBy(xpath="//*[@id=\"MIY4I0X\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"DTQG4A7\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"D2KLH4H\"]")
	WebElement post;
	
	@FindBy(xpath="//*[@id=\"WTTKKTA\"]")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"UPQBNMI\"]")
	WebElement gst;
	
	public Cartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	 public void cart() throws InterruptedException
	 {
		 Thread.sleep(2000);
		
		 cart.click();
		 Thread.sleep(3000);
		
		 checkout.click();
		 Thread.sleep(4000);
		
		
	/*	company.sendKeys("asdfghjhgy");

		adress.sendKeys("ernakulam");
		
		city.sendKeys("ernakulam");
		
		Select drop=new Select(state);
		drop.selectByVisibleText("Kerala");
	
		post.sendKeys("695432");
		
		phone.sendKeys("987654321");
		
		gst.sendKeys("qwe34567yy");*/
	 }
}
