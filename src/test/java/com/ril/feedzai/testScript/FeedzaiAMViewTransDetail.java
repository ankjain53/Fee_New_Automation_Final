package com.ril.feedzai.testScript;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class FeedzaiAMViewTransDetail extends FeedzaiTestBaseClass 
{
	@BeforeClass(description="Verification of Transaction Details")

	public void SelectAlert() throws Exception 
	{
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
		Thread.sleep(2000);
		logger.info("SelectMerchantTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertTab"))).click();
		Thread.sleep(20000);
		logger.info("SelectAlertTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertSelect"))).click();
		Thread.sleep(3000);
		logger.info("SelectAlert");
		driver.findElement(By.xpath(pro.getProperty("ViewSelectedAlert"))).click();
		Thread.sleep(3000);
		logger.info("Transaction Details Found");
		TakeScreenshot.captuerScreenshot(driver, "TransactionDetailCaptured");
	}




	@Test(priority = 5,description = "MARK Transaction AS NOT FRAUD", groups = {"Transaction Details"})
	public void MarkTransactionNotFraud() throws Exception
	{

		logger1 = extent.createTest("MARK Transaction AS NOT FRAUD");
		driver.findElement(By.xpath(pro.getProperty("MarkNotFraud"))).click();
		Thread.sleep(3000);
		logger.info("Transaction to be Marked As NotFraud");
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(2000);
		logger.info("ObservationEntered");
		TakeScreenshot.captuerScreenshot(driver, "TransactionNotFraud");
		driver.findElement(By.xpath(pro.getProperty("SelectNotFraud"))).click();
		Thread.sleep(3000);
		logger.info("Transaction Marked As NotFraud");

	}




	@Test(priority = 6,description = "Mark Transaction Fraud", groups = {"Transaction Details"})
	public void MarkAlertAsFraud() throws Exception
	{

		logger1 = extent.createTest("Mark Transaction Fraud");
		driver.findElement(By.xpath(pro.getProperty("MarkFraud"))).click();
		Thread.sleep(3000);
		logger.info("Transaction to be Marked As Fraud");
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(2000);
		logger.info("ObservationEntered");
		TakeScreenshot.captuerScreenshot(driver, "TransactionFraud");
		driver.findElement(By.xpath(pro.getProperty("SelectFraud"))).click();
		Thread.sleep(3000);
		logger.info("Transaction Marked As Fraud");
	}


	/* @Test(priority = 7,description = "Mark Transaction Suspicious", groups = {
	        "Transaction Details"
		  })
	public void MarkAlertAsSuspicious() throws Exception
	{

	   driver.findElement(By.xpath(pro.getProperty("MarkTransSuspicious"))).click();
	   Thread.sleep(3000);
	   logger.info("Transaction to be Marked As Suspicious");
	   driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
	   Thread.sleep(3000);
	   logger.info("Observation Entered");  
	   driver.findElement(By.xpath(pro.getProperty("SuspiciousQueue"))).click();
	   Thread.sleep(2000);
	   logger.info("ClickOnQueue"); 
	   driver.findElement(By.xpath(pro.getProperty("MyQueueTranDetail"))).sendKeys("Testing");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("MyQueueTranDetail"))).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   logger.info("QueueSelected"); 
	   driver.findElement(By.xpath(pro.getProperty("FoundSuspicious"))).click();
	   Thread.sleep(5000);
	   logger.info("Alert MArked Suspicious");
	  } */

}

