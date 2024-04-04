package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Medicine {

	
	WebDriver driver;
public Medicine(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements (driver,this);
}


	 @FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[3]/a")
		WebElement medicine;
	 
	 @FindBy(xpath="//*[@id=\"sorter\"]")
		WebElement dropbutton ;
	 
	
	 
	 @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/ol/li[1]/div/div/div[2]/a/span/span/img")
		WebElement kankayamgulika ;
	 
	 @FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[4]/div/a/span")
		WebElement kanwishlist ;
	 
	 
	 
	 public void medicinedropdown() throws InterruptedException 
		{
			
			medicine.click();
			
			Select details=new Select(dropbutton);
			details.selectByVisibleText("Price");
			kankayamgulika.click();
			//kanwishlist.click();
			Thread.sleep(1000);
		}
}
