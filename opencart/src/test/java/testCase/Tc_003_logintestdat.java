package testCase;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.Home_page;
import pageObject.Login_page;
import utilities.DataProviders;

public class Tc_003_logintestdat extends base_class {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
		void loginsuccesfull(String email,String pwd,String exp)
		{
	    	try {
		   logger.info("******** login test started**********");
			Home_page hm=new Home_page(driver);
			hm.click_Myacount();
		  logger.info("******** clicked on my account link**********");
		    hm.clickloginlink();
		  logger.info("******** clicked on myaccount link**********");
	        Login_page lg=new Login_page(driver);
	        lg.send_txtEmail(email);
	  	  logger.info("******** email sent**********");
	        lg.send_txtpasword(pwd);
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