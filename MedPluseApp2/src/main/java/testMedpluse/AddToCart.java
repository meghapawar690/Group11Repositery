package testMedpluse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	Actions act;
	
	@FindBy (xpath="//p[text()='NISE 30GM GEL']")
	private WebElement viewproduct;
	
	@FindBy (xpath="(//button[@type='button'])[6]\")")
	private WebElement addToCart;
	
	@FindBy (xpath="//span[@id='cart']")
	private WebElement cartPage;
	
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions (driver);
		
	}
	public void View()
	{
		viewproduct.click();
	}
	
	public void AddCart()
	{
		addToCart.click();
	}
	
	public void CartPages()
	{
		cartPage.click();
	}
	

}
