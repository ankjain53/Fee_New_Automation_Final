package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class HoldandRelease extends FeedzaiTestBaseClass
{
	@Test(priority=37, description="View P2M Transaction")
	public void viewTransaction() throws Exception
	{	
		logger1 = extent.createTest("View P2M Transaction");
		driver.findElement(By.xpath(pro.getProperty("SearchTab"))).click();
		Thread.sleep(9000);
		logger.info("Clicked on Search tab");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Search_date"))).clear();
		driver.findElement(By.xpath(pro.getProperty("Clear_txt"))).click();
		Thread.sleep(4000);
		

		driver.findElement(By.xpath(pro.getProperty("ClickonTrans"))).sendKeys(pro.getProperty("RRN"));
		Thread.sleep(2000);
		logger.info("Clicked on Transaction tab");
		driver.findElement(By.xpath(pro.getProperty("ClickonTrans"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		logger.info("Entered transaction ID");
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-eye-open']")).click();
		logger.info("Clicked on transaction view");
		Thread.sleep(5000);
		TakeScreenshot.captuerScreenshot(driver, "Transaction view");
	}

	@Test(priority=38, description="Mark suspicious")	
	public void markSuspicious() throws Exception
	{
		logger1 = extent.createTest("Mark suspicious");
		driver.findElement(By.xpath(pro.getProperty("MarkSusp"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Suspicious button");


		driver.findElement(By.xpath(pro.getProperty("EnterObs"))).sendKeys("test");
		Thread.sleep(5000);
		logger.info("Clicked on observation option and entered value");

		driver.findElement(By.xpath(pro.getProperty("ChooseQueue"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Choose queue");

		driver.findElement(By.xpath(pro.getProperty("ChoosefromQueue"))).click();
		Thread.sleep(8000);
		logger.info("Value selected from the list");

		driver.findElement(By.xpath(pro.getProperty("SuspiciousButton"))).click();
		Thread.sleep(15000);
		logger.info("Transaction marked suspicious successfully");
		TakeScreenshot.captuerScreenshot(driver, "Transaction marked suspicious successfully");
		//Thread.sleep(5000);
		//logger.info("Clicked on view transaction");
	}

	/*	
	 * 
	 * 	(Below Code is working fine, but commented due to transaction not coming from wallet)

	@Test(priority=39, description="Send to Release funds")	

	public void releaseFunds() throws Exception
	{
		logger1 = extent.createTest("Send to Release funds");
		driver.findElement(By.xpath(pro.getProperty("ReleaseFunds"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Release funds button");

		driver.findElement(By.xpath(pro.getProperty("CancelButton"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Cancel button");

	}
	/*	driver.findElement(By.xpath(pro.getProperty("EnterObs"))).sendKeys("testtt");
		Thread.sleep(5000);
		logger.info("Entered value for observation");

		driver.findElement(By.xpath(pro.getProperty("SendToRelease"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Send to Release tab");
		TakeScreenshot.captuerScreenshot(driver, "Transaction sent to release");

		driver.findElement(By.xpath(pro.getProperty("ReleaseButton"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Release Funds");


	}

	@Test(priority=40, description="Accepting funds")	
	public void acceptFunds() throws Exception
	{
		logger1 = extent.createTest("Accepting funds");
		driver.findElement(By.xpath("//html//th[2]/button[1]")).click();
		Thread.sleep(5000);
		logger.info("Clicked on Settings");

		driver.findElement(By.xpath("//i[@class='fa fa-sort-amount-desc']")).click();
		Thread.sleep(5000);
		logger.info("Clicked on descending button");

		driver.findElement(By.xpath(pro.getProperty("AcceptRelease"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on accept release");

		driver.findElement(By.xpath(pro.getProperty("EnterObs"))).sendKeys("test");
		Thread.sleep(5000);
		logger.info("Clicked on observation option and entered value");

		driver.findElement(By.xpath(pro.getProperty("AccReleaseOfFunds"))).click();
		Thread.sleep(5000);
		logger.info("Transaction released...");

	}

	@Test(priority=41, description="Validation of transaction Release state")	
	public void verifyReleaseState() throws Exception
	{
		logger1 = extent.createTest("Validation of transaction Release state");
		driver.findElement(By.xpath(pro.getProperty("SearchTab"))).click();
		Thread.sleep(10000);
		logger.info("Clicked on Search tab");

		driver.findElement(By.xpath(pro.getProperty("ClickonTrans"))).sendKeys(pro.getProperty("RRN"));
		Thread.sleep(2000);
		logger.info("Clicked on Transaction tab");
		driver.findElement(By.xpath(pro.getProperty("ClickonTrans"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		logger.info("Entered transaction ID");
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-eye-open']")).click();
		logger.info("Clicked...");
		Thread.sleep(5000);

		Boolean my_element = driver.findElement(By.xpath(pro.getProperty("FundsState"))).isDisplayed();
		logger.info(my_element);
		logger.info("Transaction is released successfully"); 
		TakeScreenshot.captuerScreenshot(driver, "Transaction released");
		Assert.assertTrue(my_element,"Transaction is not released"); 


	} */

	@Test(priority=42, description="Mark Not Fraud")	
	public void markAsNotFraud() throws Exception
	{
		logger1 = extent.createTest("Mark Not Fraud");
		driver.findElement(By.xpath(pro.getProperty("MarkNotFraud"))).click();
		Thread.sleep(8000);
		logger.info("Clicked on not fraud tab");

		driver.findElement(By.xpath(pro.getProperty("EnterObs"))).sendKeys("test");
		Thread.sleep(3000);
		logger.info("Entered observation");

		driver.findElement(By.xpath(pro.getProperty("NotFraudButton"))).click();
		Thread.sleep(3000);
		logger.info("Transaction marked Not fraud successfully");
		TakeScreenshot.captuerScreenshot(driver, "Transaction marked not fraud");
	} 



}
