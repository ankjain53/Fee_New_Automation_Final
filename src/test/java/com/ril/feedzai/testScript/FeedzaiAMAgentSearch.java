package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;


public class FeedzaiAMAgentSearch extends FeedzaiTestBaseClass 
{
	@BeforeClass(description="Agent Search Screen")
	public void ClickMerchantTab() throws Exception

	{
		driver.findElement(By.xpath(pro.getProperty("AGENTTab"))).click();
		Thread.sleep(5000);
		logger.info("SelectAgentTab");
		TakeScreenshot.captuerScreenshot(driver, "AgentTabSelected");



	}

	@Test(priority = 21, description = "ENTER AGENT ID", groups = {"AGENT"})
	public void AgentSearch() throws Exception 
	{

		logger1 = extent.createTest("Validation of Agent Search");
		driver.findElement(By.xpath(pro.getProperty("AMEnterAgentID"))).sendKeys(pro.getProperty("AGENTID"));
		Thread.sleep(10000);
		TakeScreenshot.captuerScreenshot(driver, "AgentIDEntered");
		logger.info("AGENTIDEntered");
		driver.findElement(By.xpath(pro.getProperty("AMEnterAgentID"))).sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		logger.info("AGENTIDSelected");
		String MyAgentDetail=driver.findElement(By.xpath(pro.getProperty("AgentDetail"))).getText();
		System.out.println(MyAgentDetail);
		Thread.sleep(2000);
		TakeScreenshot.captuerScreenshot(driver, "AgentDetailEntered");
		logger.info("AGENTDetailSelected");
		driver.findElement(By.xpath(pro.getProperty("AgentLocation"))).click();
		TakeScreenshot.captuerScreenshot(driver, "AgentLocationDetail");
		Thread.sleep(2000);
		logger.info("AgentLocation");
		driver.findElement(By.xpath(pro.getProperty("ChannelStatics"))).click();
		TakeScreenshot.captuerScreenshot(driver, "Channel Statics");
		Thread.sleep(2000);
		logger.info("Channel Statics");
		driver.findElement(By.xpath(pro.getProperty("TransactionHistory"))).click();
		TakeScreenshot.captuerScreenshot(driver, "Transaction History");
		Thread.sleep(2000);
		logger.info("Transaction History");

	}

}