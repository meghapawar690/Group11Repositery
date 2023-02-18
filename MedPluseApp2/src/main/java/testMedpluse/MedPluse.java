package testMedpluse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedPluse {
	
	 WebDriver driver;
	
	

	@FindBy (xpath="//button[@class='close']")
    private WebElement cross;
	
	@FindBy (xpath="//input[@placeholder='Search for... General or Pharma products']")
    private WebElement search;
	

	
	
	public MedPluse(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public void cross()
	{
		cross.click();
	}
	
	public void search()
	{
		 search.click();
	     search.sendKeys("NISE");
	        
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
