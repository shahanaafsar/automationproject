package testpkg;



import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Aryabase;
import excelpkg.Aryaexcel;
import pagepkg.Aryapage;
import pagepkg.Blog;
import pagepkg.Cartpage;
import pagepkg.Category;
import pagepkg.Contactus;

import pagepkg.Home;
import pagepkg.Medicine;
import pagepkg.Medicinesearch;
import pagepkg.Publications;
import pagepkg.Screenshotarya;
import pagepkg.Videoconsultation;


public class Aryatest extends Aryabase{

	@Test
	public void test() throws InterruptedException, IOException
	{
		Aryapage a1=new Aryapage(driver);
		Screenshotarya s1=new Screenshotarya(driver);
		Medicine med=new Medicine(driver);
		Category cat1=new Category(driver);
		Medicinesearch med1=new Medicinesearch(driver);
		Videoconsultation video=new Videoconsultation(driver);
		Cartpage car=new Cartpage(driver);
		Home h1=new Home(driver);
		Publications pub=new Publications(driver);
		Contactus con = new Contactus(driver);
		Blog bl=new Blog(driver);
		/*String x1="C:\\Users\\s\\Desktop\\test excel\\arya.xlsx";
		String Sheet="Sheet1";
		int rowCount=Aryaexcel.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String username=Aryaexcel.getCellValue(x1, Sheet, i, 0);
			System.out.println("username="+username);
			String password=Aryaexcel.getCellValue(x1, Sheet, i, 1);
			System.out.println("password="+password);
			
			a1.loginn();
			a1.scroll();
			a1.setvalues(username, password);
			a1.recaptcha();
			a1.sign();
			a1.refresh();
		}*/
		
		a1.loginn();
		s1.screensht();
	    a1.setvalues("shahana852@gmail.com", "Shahana1");
		
	    a1.recaptcha();
		
	    a1.sign();   
		
	
		a1.home();
		a1.title();
		a1.logo();
		a1.linkcount();;
		a1.linkvalidation();
		a1.linkcodevalidation1();
		
		bl.blogop();
		pub.publicationclick();
		con.contactpage();
	video.videoconsultations();
		h1.homeclick();
	   med.medicinedropdown();
	
		a1.home();
		cat1.categorylist();
		med1.searchbar();
		car.cart();
	
		
		
		
	}
}
