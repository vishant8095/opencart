package testCase;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.Home_page;
import pageObject.Login_page;

public class Tc_002_logintest extends base_class {
	
    @Test
	void loginsuccesfull()
	{
    	try {
	   logger.info("******** login test started**********");
		Home_page hm=new Home_page(driver);
		hm.click_Myacount();
	  logger.info("******** clicked on my account link**********");
	    hm.clickloginlink();
	  logger.info("******** clicked on myaccount link**********");
        Login_page lg=new Login_page(driver);
        lg.send_txtEmail(p.getProperty("username"));
  	  logger.info("******** email sent**********");
        lg.send_txtpasword(p.getProperty("password"));
  	  logger.info("******** password sent**********");
        lg.click_btnlogin();
  	  logger.info("******** clicked login buttton**********");
  	     boolean status=lg.verifyel_myaccount();
  	     Assert.assertEquals(status,true);
    	}
    	catch(Exception e)
    	{
    		Assert.fail();
    	}

		
	}
	
	
	
	
	
	
	
}
