package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class FeedzaiAMMerchantSearch extends FeedzaiTestBaseClass {


	@BeforeClass(description="Merchant Search Home Screen")
	public void ClickMerchantTab() throws Exception

	{
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
		Thread.sleep(3000);
		logger.info("SelectMerchantTab");
		TakeScreenshot.captuerScreenshot(driver, "MerchantTabSelected");
	}




	@Test(priority = 19, description = "ENTER MERCHANT MOBILE NO", groups = {"MERCHANT"})
	public void EnterMerchantNo() throws Exception 
	{
		logger1 = extent.createTest("Validation of Enter MerchantNo");
		driver.findElement(By.xpath(pro.getProperty("AMEnterMERCHANTMNo"))).sendKeys(pro.getProperty("MerNumber"));
		Thread.sleep(5000);
		logger.info("MerMobileNumberEntered");
		driver.findElement(By.xpath(pro.getProperty("AMSelectMer"))).click();
		Thread.sleep(9000);
		logger.info("MerchantSelected");
		//Verify Merchant Details
		String MerDetail= driver.findElement(By.xpath(pro.getProperty("AMVerifyMerchDetails"))).getText();
		System.out.println(MerDetail);
		Thread.sleep(2000);
		logger.info("MerchantDetailVerified");
		TakeScreenshot.captuerScreenshot(driver, "MerchantDetailCaptured");
		//Verify Merchant Location Details
		String LocationDetail= driver.findElement(By.xpath(pro.getProperty("AMVerifyMerchLoaction"))).getText();
		Thread.sleep(2000);
		logger.info("MerchantLocationVerified");
		//Verify Merchant Transactions Statistics
		String TransactionStatistics= driver.findElement(By.xpath(pro.getProperty("AMVerifyTransactionStatics"))).getText();
		Thread.sleep(2000);
		logger.info("MerchantTransactionsStatisticsVerified");
		//Verify Merchant Customer Statistics
		String CustomerStatistics= driver.findElement(By.xpath(pro.getProperty("AMVerifyCustomerStatics"))).getText();
		Thread.sleep(2000);
		logger.info("MerchantCustomerStatisticsVerified");
		//Verify Merchant Transactions Are Available
		String TransactionDetail= driver.findElement(By.xpath(pro.getProperty("AMVerifyMerchTransaction"))).getText();
		Thread.sleep(2000);
		logger.info("MerchantTransactionVerified");



	}


	@Test(priority = 20, description = "ENTER MERCHANT MOBILE ID", groups = {"MERCHANT"})
	public void EnterMerchantMID() throws Exception {

		logger1 = extent.createTest("Validation of Enter Merchant MID");
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
		Thread.sleep(4000);
		logger.info("SelectMerchantTab");
		driver.findElement(By.xpath(pro.getProperty("AMEnterMERCHANTMNo"))).sendKeys(pro.getProperty("MerMID"));
		Thread.sleep(7000);
		logger.info("MerID");
		driver.findElement(By.xpath(pro.getProperty("AMSelectMer"))).click();
		Thread.sleep(10000);
		logger.info("MerchantSelected");
		TakeScreenshot.captuerScreenshot(driver, "MerchantDetailObtainedviaID");
	}



}