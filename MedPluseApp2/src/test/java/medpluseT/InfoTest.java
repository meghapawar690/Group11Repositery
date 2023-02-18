package medpluseT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import testMedpluse.AddToCart;
import testMedpluse.Information;

public class InfoTest {
	
	
	

	WebDriver driver;
	
	@BeforeClass
	
		public void openBrowser()
		{
			System.setProperty("webdriver.chrome.driver",
					"E:\\selenium\\chromedriver.exe");

		      driver =new ChromeDriver();
		
		   
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@BeforeMethod
	
	public void lunchApp()
	{
		System.out.println("ApplicationLounch");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.medplusmart.com/");
		 
		 Information info=new Information(driver);
		 info.viewShoppingCart();
		 info.mobileno2();
		 info.otp();
		 info.save();
		 
				 
			
	}
	

}
