package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[1]/a")
	WebElement homepage;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/ul/li[1]")
	WebElement kashayam;
	
	@FindBy(xpath="//*[@id=\"tab76-categoryTab\"]/div/div/div[1]/div/div[3]/div/div/div/div")
	WebElement kash3;
	
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]")
	WebElement kash3cart;
	
	@FindBy(xpath="//*[@id=\"tab76-categoryTab\"]/div/div/div[1]/div/div[5]/div/div/div/div/div[2]/div[2]/center/div[1]/form/button")
	WebElement dhancart;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/ul/li[2]")
	WebElement churnam;
	
	@FindBy(xpath="//*[@id=\"tab74-categoryTab\"]/div/div/div[1]/div/div[3]/div/div/div/div/a/span/span")
	WebElement churnam3;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[4]/div/a/span")
	WebElement churnamwish;

	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/ul/li[3]")
	WebElement Thailam;
	
	@FindBy(xpath="//*[@id=\"tab81-categoryTab\"]/div/div/div[1]/div/div[4]/div/div/div/div/a/span/span")
	WebElement kumkumadithailam;
	
	@FindBy(xpath="//*[@id=\"tab81-categoryTab\"]/div/div/div[1]/div/div[4]/div/div/div/div/div/div[2]/center/div[1]/form/button")
	WebElement kumkumaddcart;
	
	@FindBy(id="product-addtocart-button")
	WebElement panchcart;
	public void homeclick() throws InterruptedException
	{
		homepage.click();
	
		kashayam.click();
		kash3.click();
		String title= driver.getTitle();
		System.out.println("Title :"+title);
		
		kash3cart.submit();
	
		//homepage.click();
	
	
	/* JavascriptExecutor js = (JavascriptExecutor) driver;
		
	 js.executeScript("window.scrollBy(0,800)");
	 
	 
		 Thread.sleep(1000);
			churnam.click();
		
	/*	churnam3.click();
		String title3= driver.getTitle();
		System.out.println("Title :"+title3);
	
		homepage.click();
		Thailam.click();
		
		kumkumadithailam.click();
		String title1= driver.getTitle();
		System.out.println("Title :"+title1);*/
		//kumkumaddcart.click();
			}
	
}
