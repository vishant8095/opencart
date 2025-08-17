package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_page {

	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement msgconfirmation;
	
	public String get_msgconfirmation()
	{
		return msgconfirmation.getText();
	}
	
	public Myaccount_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}
