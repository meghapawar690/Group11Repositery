package testMedpluse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {

	WebDriver driver;
	

	@FindBy (xpath="//button[@id='pharmaCheckOutBtn']")
	private WebElement viewShoppingCart;
	
	@FindBy (xpath="//input[@id='mobileNumber']")
	private WebElement mobileno2;
	
	@FindBy (xpath="//button[text()='Send OTP']")
	private WebElement otp;
	
	@FindBy (xpath="//button[text()='Save & Continue']")
	private WebElement save;
	
	
	
	public Information (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void viewShoppingCart()
	{
		viewShoppingCart.click();
	}
	
	public void mobileno2()
	{
		mobileno2.click();
		mobileno2.sendKeys("7276844423");
	}
	
	public void otp()
	{
		otp.click();
		otp.sendKeys();
	}
	
	public void save()
	{
		save.click();
	}
	

}
