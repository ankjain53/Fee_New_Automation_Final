package com.ril.feedzai.testScript;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class FeedzaiAMReports extends FeedzaiTestBaseClass 
{


	@Test(priority=23 , description="Check Reports")

	public void Report() throws Exception 
	{
		logger1 = extent.createTest("Validation of Report");
		driver.findElement(By.xpath(pro.getProperty("AMReports"))).click();
		Thread.sleep(3000);
		logger.info("ClickOnReports");
		driver.findElement(By.xpath(pro.getProperty("AMReportsDownload"))).click();
		Thread.sleep(3000);
		logger.info("AbleToDownloadReports"); 



	}



}
