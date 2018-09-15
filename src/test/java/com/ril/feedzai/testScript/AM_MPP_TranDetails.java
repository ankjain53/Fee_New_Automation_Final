package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AM_MPP_TranDetails extends FeedzaiTestBaseClass

{
	  
	
	@Test(priority=67 , description="Validate MPP transaction details in Alert Manager")
	
	public void MPP_Tran_Data() throws Exception
	{
		
		logger1 = extent.createTest("Validate MPP transaction details in Alert Manager ");
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
		  
		  driver.findElement(By.xpath(pro.getProperty("channel_p2m_txt"))).sendKeys("MPP");
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

@Test(priority=68 , description="Validate Merchant terminal id & device id in MPP transaction")

public void MPP_Customer_dt() throws Exception
{
	logger1 = extent.createTest("Validate Merchant terminal id & device id in MPP transaction");
		  String tid_1 = driver.findElement(By.xpath(pro.getProperty("tid"))).getText();
		  System.out.println("Customer terminal id ="+ tid_1);
		  if(tid_1.equals("Unknown") ) {
			  logger.info("Merchant terminal is not present");
			  Assert.fail("Merchant terminal id is not found in merchant details section");
		  }else {
			  logger.info("Merchant terminal is present");
		  }
		   
		 
		  String div_id=driver.findElement(By.xpath(pro.getProperty("device_id"))).getText();
		  System.out.println("Customer device id ="+ div_id);
		  if(div_id.equals("Unknown")) {
			  logger.info("Device id is not Present");
			  Assert.fail("Customer device id not found in transaction details section");
		  } else{
			  logger.info("Device id is Present");
		    }
	
}

@Test(priority=69 , description="Validate customer card details in MPP transaction ")

public void MPP_Card_dt() throws Exception
{
	
	logger1 = extent.createTest("Validate customer card details in MPP transaction");
		  String mpp_card_dt=driver.findElement(By.xpath(pro.getProperty("mpp_card"))).getText();
		  System.out.println("Customer Card Details ="+ mpp_card_dt);
		  if(mpp_card_dt.equals("Unknown")) {
			  logger.info("Customer card detail is not Present");
			  Assert.fail("Customer card details not found for customer in instrument details section");
		  }else {
			  logger.info("Customer card detail is Present");
		  }
}

@Test(priority=70 , description="Validate SID in MPP transaction ")

public void MPP_transaction_dt() throws Exception
{
	logger1 = extent.createTest("Validate SID in MPP transaction");
		  String sid=driver.findElement(By.xpath(pro.getProperty("mpp_sid"))).getText();
		  System.out.println("MPP Source Institution ID ="+ sid);
		  if(sid.equals("Unknown")) 
		  {
			  logger.info("MPP:Source Institution ID is not present");
			  Assert.fail("SID not found for MPP transaction in transaction details section");	 
			
		  }else {
			  logger.info("MPP:Source Institution ID is present");
		  }

	
			
	}

}
