package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medicinesearch {

	WebDriver driver;
	public Medicinesearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	 @FindBy(id="search")
	   WebElement search;
	
	 
	 @FindBy(id="product-addtocart-button")
	   WebElement panchamrithamaddcart;
	
	 public void searchbar() throws InterruptedException 
		{
			
			search.sendKeys("kashayam",Keys.ENTER);
			List <WebElement>list1=driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/ol/li"));
			int length=list1.size();
			System.out.println(length);
			if(length !=0)
			{
				
			
			for(WebElement li:list1) 
			{
				String kashayamlist=li.getText();
				System.out.println("kashayam list:"+kashayamlist);
				
				boolean status=li.getText().contains("Pachanamritam Kashayam");
				System.out.println("status="+status);
				if(status==true)
				{
					li.click();
					break;
				}
				else {
					System.out.println("doesnot contains this medicine");
				}
			}
			}
			else {
				System.out.println("length  equal to zero");
			}
			Thread.sleep(3000);
			panchamrithamaddcart.click();
			
		}
}
