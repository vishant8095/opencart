package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

@FindBy(xpath="//span[text()='My Account']")
private WebElement Myacount;

@FindBy(xpath="//a[normalize-space()='Register']")
private WebElement registe_btn;

@FindBy(xpath="//a[normalize-space()='Login']")
private WebElement loginlink;

public void click_Myacount()
{
	Myacount.click();
}

public void click_registe_btn()
{
	registe_btn.click();
}
public void clickloginlink()
{
	loginlink.click();
}
public 	Home_page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	
	
}
