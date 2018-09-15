package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AM_IBW_TranDetails extends FeedzaiTestBaseClass

{
	 
	
	@Test(priority=71 , description="Validate IBW transaction details in Alert Manager")
	
	public void P2M_Tran_Data() throws Exception
	{
		
		logger1 = extent.createTest("Validate IBW transaction details in Alert Manager ");
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
	
		logger.info("SelectMerchantTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertTab"))).click();
		//Thread.sleep(20000);
		logger.info("SelectAlertTab");  
		TakeScreenshot.captuerScreenshot(driver, "AlertTabSelected");
		//Thread.sleep(20000);
		
		  driver.findElement(By.xpath(pro.getProperty("Alert_Setting"))).click();
		  logger.info("Click on setting");
		  
		  driver.findElement(By.xpath(pro.getProperty("Alert_set_dec"))).click();
		  logger.info("Click on Decending order");
		  
		  driver.findElement(By.xpath(pro.getProperty("Channel_p2m"))).click();
		  logger.info("Click on Channel");
		  
		  driver.findElement(By.xpath(pro.getProperty("channel_p2m_txt"))).sendKeys("IBW");
		  driver.findElement(By.xpath(pro.getProperty("channel_p2m_txt"))).sendKeys(Keys.ENTER);
		  logger.info("Enter P2M ");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pro.getProperty("response_code"))).click();
		  logger.info("Click on Response code");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pro.getProperty("response_code_enter"))).sendKeys("00");
		  driver.findElement(By.xpath(pro.getProperty("response_code_enter"))).sendKeys(Keys.ENTER);
		  logger.info("Enter Response code ");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pro.getProperty("p2m_view"))).click();
		  logger.info("Viewed IBW transaction ");
	}	  
		
	@Test(priority=72, description="Customer id in IBW transaction")
		  
		  public void IBW_Customer_Details()
		  {		
			  
	    	logger1 = extent.createTest("Customer id in IBW transaction");
		     String cust_id = driver.findElement(By.xpath(pro.getProperty("bill_pay_cut_id"))).getText();
		     System.out.println("Customer id ="+ cust_id);
		    if(cust_id.equals("Unknown") ) {
			  logger.info("Customer id not Present");
			  Assert.fail("Customer id not found in customer details section for IBW transaction");
		      }else {
			  logger.info("Customer id is Present");
		     }
		   	    
		    String mob=driver.findElement(By.xpath(pro.getProperty("bil_pay_mob"))).getText();
			  System.out.println("Customer Mobile number ="+ mob);
			  if(mob.equals("Unknown")) {
				  logger.info("Mobile Number is not Present");
				  Assert.fail("Mobile number not found in customer details section for IBW transaction");
			  }else {
				  logger.info("Mobile Number is  Present");
			  }
			  	
		  }
			
	@Test(priority=73, description="Validate Payment Details in IBW transaction")
	  
	  public void IBW_Payment_Details()
	  {
	
		 	
		logger1 = extent.createTest("Validate Payment Details in IBW transaction");
		  String bill_details=driver.findElement(By.xpath(pro.getProperty("bill_dt"))).getText();
		  System.out.println("Customer bill details ="+ bill_details);
		  if(bill_details.equals("Unknown")) {
			  logger.info("Customer bill detail is not Present");
			  Assert.fail("Customer bill detail not found in payment details section for IBW transaction");
		  }else {
			  logger.info("Customer bill detail is Present");
		  }
		  
	  }
	
	@Test(priority=74, description="Validate SID in IBW transaction")
	  
	  public void IBW_transaction_Details()
	  {
		logger1 = extent.createTest("Validate SID in IBW transaction");
		  String sid=driver.findElement(By.xpath(pro.getProperty("lmw_sid"))).getText();
		  System.out.println("Source Institution ID="+ sid);
		  if(sid.equals("Unknown")) 
		  {
			  logger.info("IBW:Source Institution ID is not present");
			  Assert.fail("SID not found in transaction details section for IBW transaction");
			
		  }else {
			  logger.info("IBW:Source Institution ID is present");
		  }

		  String cust_app_id=driver.findElement(By.xpath(pro.getProperty("bill_pay_cust_appid"))).getText();
		  System.out.println("Customer app id="+ cust_app_id);
		  if(cust_app_id.equals("Unknown")) 
		  {
			  logger.info("Customer app id is not present");
			  Assert.fail("Customer app id not found in transaction details section for IBW transaction");
			
		  }else {
			  logger.info("Customer app id is present");
		  }

			
	}

}
