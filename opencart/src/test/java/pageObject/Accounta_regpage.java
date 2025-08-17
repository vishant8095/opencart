package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accounta_regpage {

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement textFirstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement textLastname;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement textemail;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement textphonenumber;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement textpassword;
	
	@FindBy(xpath="//input[@name='confirm']")
	private WebElement textconfimpasword;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacy_policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement btncontinue;
	
	public void send_textFirstname(String name)
	{
		textFirstname.sendKeys(name);
	}
	public void send_textLastname(String lname)
	{
		textLastname.sendKeys(lname);
	}
	public void send_textemail(String email)
	{
		textemail.sendKeys(email);
	}
	public void send_textphonenumber(String phone)
	{
		textphonenumber.sendKeys(phone);
	}
	public void send_textpassword(String pwd)
	{
		textpassword.sendKeys(pwd);
	}
	public void send_textconfimpasword(String conpwd)
	{
		textconfimpasword.sendKeys(conpwd);
	}
	public void click_privacy_policy()
	{
		privacy_policy.click();
	}
	public void click_btncontinue()
	{
		btncontinue.click();
	}
	
	public Accounta_regpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
