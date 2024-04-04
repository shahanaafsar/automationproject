package pagepkg;



import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Aryapage {
WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/div/div[1]/div[2]/div/a")
	WebElement login1;
	
	@FindBy(name="login[username]")
	WebElement email;
	
	@FindBy(name="login[password]")
	WebElement password1;
	
	
	
	@FindBy(id="send2")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[1]/a")
	WebElement homepage;
	
	
	
	
	
	
	public Aryapage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	public void loginn()
	{
		login1.click();
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	public void setvalues(String username, String password)
	{
		email.sendKeys(username);
		password1.sendKeys(password);
	}
	
	public void recaptcha() throws InterruptedException
	{
    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"mp_recaptcha_0\"]/div/div/iframe")));
    Thread.sleep(9000);
    driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
    driver.switchTo().defaultContent();
    Thread.sleep(3000);
	}
	
	public void loginbutton()
	{
		Assert.assertEquals(driver.findElement(By.id("send2")).getText(),"sign in" );
		driver.getTitle();
	}
	public void title()
	{
		//Assert.assertEquals(driver.getTitle(),"Buy Ayurvedic Products Online | Kottakkal Arya Vaidya Sala Products");
		String actual=driver.getTitle();
		String expected="Buy Ayurvedic Products Online | Kottakkal Arya Vaidya Sala Products";
		Assert.assertEquals(actual, expected);
		System.out.println("test1 title verified");
	}
	
	
	public void sign() 
	{
		
		signin.click();
	}
	
	public void home()
	{
		homepage.click();
	}
	
	
	public void scroll()
	{
	 JavascriptExecutor js = (JavascriptExecutor) driver;
		
	 js.executeScript("window.scrollBy(0,800)");
	 
	 }
	
	 public void heading()
	 {
		String title= driver.getTitle();
		System.out.println("Title :"+title);
	 }
	
	 
	 @FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[3]/a")
		WebElement medicine;
	 
	 @FindBy(xpath="//*[@id=\"sorter\"]")
		WebElement dropbutton ;
	 
	

	 
	
	
	
	
	 public void linkvalidation()
	 {
		 String expected="https://shop.aryavaidyasala.com/";
		 String actual=driver.getCurrentUrl();
		 if(expected.equals(actual))
		 {
			 System.out.println("link is valid");
		 }
		 else
		 {
			 System.out.println("invalid link");
		 }
	 }
	
	 
	 public void logo()
	 {
		 
		 boolean logo=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[2]/div[1]/div/a/img")).isDisplayed();
		 if(logo)
		 {
			 System.out.println("logo is present");
		 }
		 else {
			 System.out.println("logo not displayed");
		 }
	 }
	 
	
	
	 
	 public void linkcount()
		{
			List<WebElement>linklist=driver.findElements(By.tagName("a"));
			System.out.println(linklist.size());
			List<WebElement>allLinks=driver.findElements(By.tagName("a"));
			for(WebElement link:allLinks) {
				System.out.println(link.getText()+"-"+link.getAttribute("href"));}
			
			
			
			List<WebElement>linklist1=driver.findElements(By.tagName("link"));
			System.out.println(linklist1.size());
			List<WebElement>linklist11=driver.findElements(By.tagName("a"));
			for(WebElement divlink:linklist11) {
				System.out.println(divlink.getText()+"-"+divlink.getAttribute("href"));
			}
		}
	 
	 public void linkcodevalidation1()
		{
	try {
		String link="https://shop.aryavaidyasala.com/";
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();	
		int code=con.getResponseCode();
		System.out.println(code);
		if(code==200)
		{
			System.out.println("response code is 200 successful");
		}
		else if(code==404)
		{
			System.out.println("response code 404--is broken link");
		}
		else
		{
			System.out.println("not expected");
		}
		}
	
	

	
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
	 }
