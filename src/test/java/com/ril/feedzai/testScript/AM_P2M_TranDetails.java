package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AM_P2M_TranDetails extends FeedzaiTestBaseClass

{
	  
		
	@Test(priority=75 , description="Validate P2M transaction details in Alert Manager")
	
	public void P2M_Tran_Data() throws Exception
	{
		
		logger1 = extent.createTest("Validate P2M transaction details in Alert Manager ");
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
	
		logger.info("SelectMerchantTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertTab"))).click();
		Thread.sleep(20000);
		logger.info("SelectAlertTab");  
		TakeScreenshot.captuerScreenshot(driver, "AlertTabSelected");
		Thread.sleep(20000);
		
		  driver.findElement(By.xpath(pro.getProperty("Alert_Setting"))).click();
		  logger.info("Click on setting");
		  
		  driver.findElement(By.xpath(pro.getProperty("Alert_set_dec"))).click();
		  logger.info("Click on Decending order");
		  
		  driver.findElement(By.xpath(pro.getProperty("Channel_p2m"))).click();
		  logger.info("Click on Channel");
		  
		  driver.findElement(By.xpath(pro.getProperty("channel_p2m_txt"))).sendKeys("P2M");
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
		  logger.info("Viewed P2M transaction ");
			 
	}
		
	@Test(priority=76 , description="Validate customer id & Mobile number in P2M transaction ")
	
	public void P2M_Customer_Data() throws Exception
	{
		logger1 = extent.createTest("Validate customer id & Mobile number in P2M transaction");
		  String cust_id = driver.findElement(By.xpath(pro.getProperty("cust_dt_p2m"))).getText();
		  System.out.println("Customer id ="+ cust_id);
		  if(cust_id.equals("Unknown") ) {
			  logger.info("Customer id not Present");
			  Assert.fail("Customer id not found for customer on customer details section");
		  }else {
			  logger.info("Customer id is Present");
		  }
		   
				 
		  String mob=driver.findElement(By.xpath(pro.getProperty("mob_no"))).getText();
		  System.out.println("Customer Mobile number ="+ mob);
		  if(mob.equals("Unknown")) {
			  logger.info("Mobile Number is not Present");
			  Assert.fail("Customer mobile number not found for customer on customer details section");
		  }else {
			  logger.info("Mobile Number is  Present");
		  }
	}	  		

	@Test(priority=77 , description="Validate customer app id in P2M transaction")
	
	public void P2M_cust_app_id() throws Exception
	{  
		logger1 = extent.createTest("Validate customer app id in P2M transaction");  
		String cust_app=driver.findElement(By.xpath(pro.getProperty("cust_app_id"))).getText();
		  System.out.println("Customer App id ="+ cust_app);
		  if(cust_app.equals("Unknown")) {
			  logger.info("Customer app id is not Present");
			  Assert.fail("Customer app id not found for customer on transaction details section");
		  }else {
			  logger.info("Customer app id is Present");
		  }
		  
	}
	
@Test(priority=79 , description="Validate Merchant app id in P2M transaction")
	
	public void P2M_merchant_app_id() throws Exception
	{ 
	    logger1 = extent.createTest("Validate merchant app id in P2M transaction");  
	     String merchant_app_id=driver.findElement(By.xpath(pro.getProperty("merchant_app_id"))).getText();
		  System.out.println("Merchant app id="+ merchant_app_id);
		  if(merchant_app_id.equals("Unknown")) 
		  {
			  logger.info("Merchant app id is not Present");
			  Assert.fail("Merchant app id not found in transaction on transaction details section");
		  }else {
			  logger.info("Merchant app id is Present");
			  
		  }

		  
			
	}

}
