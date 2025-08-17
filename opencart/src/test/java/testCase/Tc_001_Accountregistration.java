package testCase;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.Accounta_regpage;
import pageObject.Home_page;
import pageObject.Myaccount_page;

public class Tc_001_Accountregistration extends base_class {
    @Test
	void verify_account_registration()
	{
    	try {
    	logger.info("********* strating account_registration test ***********");
		Home_page hm=new Home_page(driver);
		hm.click_Myacount();
		logger.info("******** clicking on rigister link *********");

		hm.click_registe_btn();
		logger.info("******** clicking on rigister btn *********");

		Accounta_regpage regpage=new Accounta_regpage(driver);
		regpage.send_textFirstname(random_string());
		regpage.send_textLastname(random_string());
		regpage.send_textemail(random_string()+"@gmail.com");
		regpage.send_textphonenumber(random_number());
		    String pasword=random_Alphanumeric();
		regpage.send_textpassword(pasword);
		regpage.send_textconfimpasword(pasword);
		regpage.click_privacy_policy();
		logger.info("******** Entering register deatils *********");

		regpage.click_btncontinue();
		logger.info("******** clicking on rigister btn after deatils provided *********");

		
		Myaccount_page mypage=new Myaccount_page(driver);
		 logger.info("******** verifying Assertion *********");
		String status=mypage.get_msgconfirmation();
		if(status.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{        		logger.debug("debug logs...");

			logger.error("Test failed...");
			Assert.assertTrue(false);
			
		}
		//Assert.assertEquals(status,"Your Account Has Been Created! ");
    	logger.info("********* closing account_registration test ***********");
    	}
    	catch(Exception e)
    	{
    		
    		Assert.fail();
    	}
	}
	
}
