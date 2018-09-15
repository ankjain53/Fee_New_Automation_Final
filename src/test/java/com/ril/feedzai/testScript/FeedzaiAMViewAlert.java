package com.ril.feedzai.testScript;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class FeedzaiAMViewAlert extends FeedzaiTestBaseClass 
{


	@BeforeClass(description="Verification of Alert Tab")
	public void SelectAlert() throws Exception 
	{
		driver.manage().window().maximize();
		driver.get("https://10.130.236.51/#login");

		driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("MyUserName"));
				
		logger.info("UserName Entered");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("MyPassword"));
				
		logger.info("Password Entered");
		TakeScreenshot.captuerScreenshot(driver, "Login");

		driver.findElement(By.xpath(pro.getProperty("SignIn"))).click();
		logger.info("Clicked on SignIn");

		driver.findElement(By.xpath(pro.getProperty("AMMERCHANTTab"))).click();
		Thread.sleep(2000);
		logger.info("SelectMerchantTab");  
		driver.findElement(By.xpath(pro.getProperty("AlertTab"))).click();
		Thread.sleep(2000);
		logger.info("SelectAlertTab");  
		TakeScreenshot.captuerScreenshot(driver, "AlertTabSelected");


	}



	@Test(priority = 1,description = "Mark Alert Not Fraud", groups = { "ALERT"})
	public void MarkAlertNotFraud() throws Exception 
	{
		logger1 = extent.createTest("Mark Alert Not Fraud");
		driver.findElement(By.xpath(pro.getProperty("MarkAlertNotFraud"))).click();
		Thread.sleep(2000);
		logger.info("MarkAlertNotFraud");  
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(3000);
		logger.info("Observation Entered");  
		TakeScreenshot.captuerScreenshot(driver, "Alert MarkedNotFraud");
		driver.findElement(By.xpath(pro.getProperty("SelectNotFraud"))).click();
		Thread.sleep(10000);
		logger.info("AlertMarkedNotFraud"); 
	}



/*	@Test(priority = 2,description = "Mark Alert Fraud", groups = {"ALERT"})
	public void MarkAlertFraud() throws Exception 
	{
		logger1 = extent.createTest("Mark Alert Fraud");
		driver.findElement(By.xpath(pro.getProperty("MarkAlertFraud"))).click();
		Thread.sleep(2000);
		logger.info("MarkAlertNotFraud");  
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(3000);
		logger.info("Observation Entered");  
		TakeScreenshot.captuerScreenshot(driver, "AlertMarkedFraud");
		driver.findElement(By.xpath(pro.getProperty("SelectFraud"))).click();
		Thread.sleep(10000);
		logger.info("AlertMarkedFraud"); 


	}*/


/*	@Test(priority = 3,description = "Mark Alert Suspicious", groups = {"ALERT"})
	public void MarkAlertSuspicious() throws Exception 
	{

		logger1 = extent.createTest("Mark Alert Suspicious");
		driver.findElement(By.xpath(pro.getProperty("MarkAlertSuspicious"))).click();
		Thread.sleep(4000);
		logger.info("MarkAlertSuspicious");  
		driver.findElement(By.xpath(pro.getProperty("EnterYourObservation"))).sendKeys("OK");
		Thread.sleep(3000);
		logger.info("Observation Entered");  
		driver.findElement(By.xpath(pro.getProperty("SuspiciousQueue"))).click();
		Thread.sleep(2000);
		logger.info("ClickOnQueue"); */


		/* driver.findElement(By.xpath(pro.getProperty("EnterSuspiciousQueue"))).click();
	   Thread.sleep(3000);
	   logger.info("Enter Suspicious Queue");*/

		/*driver.findElement(By.xpath(pro.getProperty("MyQueueDetail"))).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("MyQueueDetail"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		logger.info("QueueSelected"); */

		/*  logger.info("Selected Queue1");
	   driver.findElement(By.xpath(pro.getProperty("Feed_queueEnter1"))).click();
	   Thread.sleep(2000);
	   logger.info("Selected Queue");
	   TakeScreenshot.captuerScreenshot(driver, "AlertMarkedSuspicious");*/
		/*driver.findElement(By.xpath(pro.getProperty("FoundSuspicious"))).click();
		Thread.sleep(10000);
		logger.info("Alert MArked Suspicious");*/

	 

}





