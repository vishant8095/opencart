package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

@FindBy(xpath="//input[@name='email']")	
private WebElement txtEmail;

@FindBy(xpath="//input[@name='password']")
private WebElement txtpasword;

@FindBy(xpath="//input[@value='Login']")
private WebElement btnlogin;

@FindBy(xpath="//h2[text()='My Account']")
private WebElement el_myaccount;

public void send_txtEmail(String email)
{
	txtEmail.sendKeys(email);
}
public void send_txtpasword(String pwd)	
{
	txtpasword.sendKeys(pwd);
}
public void click_btnlogin()
{
	btnlogin.click();
}
public boolean verifyel_myaccount()
{
	return el_myaccount.isDisplayed();
}

     public Login_page(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);   
    	 
     }	
	
}
