package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screenshotarya {
WebDriver driver;

public Screenshotarya(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements (driver,this);
}

	 public void screensht() throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("C:\\Users\\s\\Desktop\\New folder//avscreenshot.png"));
			WebElement signinbutton=driver.findElement(By.id("send2"));
			File src1=signinbutton.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src1, new File("./Screenshot/signinbutton.png"));
			
			
			File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src3,new File("C:\\Users\\s\\Desktop\\New folder//av1screenshot.png"));
			WebElement createbutton=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[2]/div[2]/div/div/a"));
			File src2=createbutton.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src2, new File("./Screenshot/createbutton.png"));
			
			WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div/div[2]/div[1]/div/a/img"));
			File src4=logo.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src4, new File("./Screenshot/logo.png"));
			
	
			WebElement contains=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div"));
			File src5=contains.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src5, new File("./Screenshot/maincontent.png"));
		}
}
