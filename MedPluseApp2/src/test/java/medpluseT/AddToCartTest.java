package medpluseT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import testMedpluse.AddToCart;

public class AddToCartTest {
	
	
	WebDriver driver;
	
	@BeforeClass
	
		public void openBrowser()
		{
			System.setProperty("webdriver.chrome.driver",
					"E:\\selenium\\chromedriver.exe");

		      driver =new ChromeDriver();
		
		     driver.get("https://www.medplusmart.com/");
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			       
		     
		}
	
	@BeforeMethod
	
	public void lunchApp()
	{
		System.out.println("ApplicationLounch");
		System.out.println("ApplicationLounch");
		 driver.get("https://www.medplusmart.com/");
		 
		 AddToCart add=new AddToCart(driver);
		 add.View();
		 add.AddCart();
		 add.CartPages();
			
	}
	
	

}
