package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {

	WebDriver driver;
	public Category(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements (driver,this);
	}
	
	 @FindBy(xpath="//*[@id=\"pt_custommenu\"]/ul/li[3]/a")
		WebElement medicine;
	
	@FindBy(xpath="//*[@id=\"narrow-by-list\"]/div/div[1]")
	WebElement category;
	
			
			
	@FindBy(xpath="//*[@id=\"tab87-categoryTab\"]/div/div/div[1]/div/div[3]/div/div/div/div/div/div[2]/center/div[1]/form/button")
	WebElement addcart;
	 
	 
	 public void categorylist()
	 {
		// medicine.click();
		// category.click();
		 List<WebElement>clist=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li"));
		 int length1=clist.size();
		 System.out.println("total list contains="+length1);
		 if(length1!=0)
		 {
			 for(WebElement lis:clist)
			 {
				String categorylistcontains= lis.getText();
				System.out.println("category list="+categorylistcontains);
				boolean status =lis.getText().contains("Tablets");
				System.out.println("status="+status);
				if(status==true)
				{
					lis.click();
					break;
					
				}
				
				
			 }
		 }
		
	 }
}
