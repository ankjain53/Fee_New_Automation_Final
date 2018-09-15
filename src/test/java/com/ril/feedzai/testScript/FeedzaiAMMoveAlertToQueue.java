package com.ril.feedzai.testScript;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FeedzaiAMMoveAlertToQueue extends FeedzaiTestBaseClass  {
	WebElement element;

	@BeforeClass(description="Verification of Alert Tab")
	public void SelectAlert() throws Exception 
	{

		Thread.sleep(9000);
		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
		Thread.sleep(2000);
		logger.info("SelectMerchantTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertTab"))).click();
		Thread.sleep(20000);
		logger.info("SelectAlertTab");  
		TakeScreenshot.captuerScreenshot(driver, "AlertTabSelected");

	}


	@Test(priority = 4,description = "Move Alert To Queue", groups = {"ALERT"})

	public void MoveAlertToQueue() throws Exception 
	{

		logger1 = extent.createTest("Move Alert To Queue");
		String StoreBeneficiaryID=driver.findElement(By.xpath(pro.getProperty("QueueBeneficiaryID"))).getText();
		System.out.println(StoreBeneficiaryID);
		logger.info("BeneficiaryIDStored"); 
		driver.findElement(By.xpath(pro.getProperty("AlertMoveToQueue"))).click();
		Thread.sleep(3000);
		logger.info("MarkAlertMoveToQueue");  
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(3000);
		logger.info("Observation Entered");
		driver.findElement(By.xpath(pro.getProperty("SuspiciousQueue"))).click();
		Thread.sleep(2000);
		// logger.info("ClickOnQueue"); 
		driver.findElement(By.xpath(pro.getProperty("MyQueueDetail"))).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("MyQueueDetail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		logger.info("QueueSelected"); 
		/*driver.findElement(By.xpath(pro.getProperty("EnterSuspiciousQueue"))).click();
 			   Thread.sleep(3000);
 			   logger.info("EnterQueueToBeMoved");
 			   driver.findElement(By.xpath(pro.getProperty("Feed_queueEnter"))).click();
 			   Thread.sleep(3000);
 			   logger.info("Selected Queue");
 			   TakeScreenshot.captuerScreenshot(driver, "AlertMovedToQueue");*/
		driver.findElement(By.xpath(pro.getProperty("AlertMovedToQueue"))).click();
		Thread.sleep(10000);
		logger.info("AlertMovedToQueue");


	}


}