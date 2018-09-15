package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AM_LMW_TranDetails extends FeedzaiTestBaseClass

{


	@Test(priority=63 , description="Validate LMW transaction details in Alert Manager")

	public void P2M_Tran_Data() throws Exception
	{

		logger1 = extent.createTest("Validate P2M transaction details in Alert Manager ");
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

		driver.findElement(By.xpath(pro.getProperty("channel_p2m_txt"))).sendKeys("LMW");
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
		logger.info("Viewed LMW transaction ");
	}		 

	@Test(priority=64 , description="Validate card details in LMW transaction ")

	public void LMW_Instrument_details() throws Exception
	{
		logger1 = extent.createTest("Validate card details in LMW transaction");
		String instrument_dt = driver.findElement(By.xpath(pro.getProperty("instument_dt"))).getText();
		System.out.println("Customer Instrument Details ="+ instrument_dt);
		if(instrument_dt.equals("Unknown") ) {
			logger.info("Customer Card details not displayed");
			Assert.fail("Card details not found in instrument details section for IBW transaction");
		}else {
			logger.info("Customer Card details displayed");
		}


		String hashed_dt=driver.findElement(By.xpath(pro.getProperty("hashed_card_dt"))).getText();
		System.out.println("Customer Hashed card Details ="+ hashed_dt);
		if(hashed_dt.equals("Unknown")) {
			logger.info("Hashed Card details not displayed");
			Assert.fail("Hashed card details not found in instrument details section for IBW transaction");
		}else {
			logger.info("Hashed Card details displayed");
		}

	}

	@Test(priority=65 , description="Validate customer app id in LMW transaction")

	public void LMW_Customer_dt() throws Exception
	{ 
		logger1 = extent.createTest("Validate customer app id in LMW transaction");
		String cust_app_lmw=driver.findElement(By.xpath(pro.getProperty("cust_mob_lmw"))).getText();
		System.out.println("Customer Mobile number ="+ cust_app_lmw);
		if(cust_app_lmw.equals("Unknown")) {
			logger.info("Customer app id is not Present");
			Assert.fail("Customer app id details not found for customer on transaction details page ");
		}else {
			logger.info("Customer app id is Present");
		}

	}

	@Test(priority=66 , description="Validate Source Institution ID in LMW transaction")

	public void LMW_transaction_details() throws Exception
	{
		logger1 = extent.createTest("Validate Source Institution ID in LMW transaction");
		String sid=driver.findElement(By.xpath(pro.getProperty("lmw_sid"))).getText();
		System.out.println("Source Institution ID ="+ sid);

		if(sid.equals("Unknown")) {
			logger.info("Source Institution ID id is not Present");
			Assert.fail("Source Institution ID not found for transaction in transaction details section");

		}else {
			logger.info("Source Institution ID id is Present");
		}



	}

}
