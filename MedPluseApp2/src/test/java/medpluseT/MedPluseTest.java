package medpluseT;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testMedpluse.MedPluse;

public class MedPluseTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\chromedriver.exe");

	      driver =new ChromeDriver();
	
	    
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	}
	
	@BeforeMethod 
	public void login()
	{
	     driver.get("https://www.medplusmart.com/");

		
		
		System.out.println("login");
		MedPluse medPluse=new MedPluse(driver);
		medPluse.cross();
		medPluse.search();
		
		
		
	}
	
	
	@Test
	public void CheckURlAndTitle() throws InterruptedException
	{
		System.out.println("Test_1");
		System.out.println("Test_1");
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		Thread.sleep(5000);
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Actual url is "+actualUrl);
		String actualTitle=driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		
		/*String expURL="https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true";
		String expTitle="Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order";
		
		if(actualUrl.equals(expURL) || actualTitle.equals(expTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}*/
	}
	
	@AfterMethod
	public void CloseApp()
	{
		System.out.println("CloseApp");
		driver.close();
	}
	@AfterClass
	public void quit()
	{
		System.out.println("quit");
		driver.quit();
	}
	
	

}
