package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;;

public class FeedzaiAMVerifyAlertInQueue extends FeedzaiTestBaseClass
{
  @Test(priority=22,description="Verify Alert IN Queue_SETTINGS")
 
  public void ClickOnSettings() throws Exception
  {   
	  
	  logger1 = extent.createTest("Verify Alert IN Queue_SETTINGS");
	  driver.findElement(By.xpath(pro.getProperty("AMSettings"))).click();
	  Thread.sleep(3000);
	  logger.info("ClickOnSettings");
	  driver.findElement(By.xpath(pro.getProperty("AMQueue"))).click();
	  Thread.sleep(3000);
	  logger.info("ClickedOnQueue");
	  driver.findElement(By.xpath(pro.getProperty("SelectYourQueue"))).click();
	  driver.findElement(By.xpath(pro.getProperty("SelectYourQueue"))).sendKeys("JPB");
	  Thread.sleep(3000);
	  logger.info("QueueSelected");
	  driver.findElement(By.xpath(pro.getProperty("ViewQueueDetails"))).click();
	  Thread.sleep(5000);
	  logger.info("ViewQueueDetails");
	  driver.findElement(By.xpath(pro.getProperty("FilterbyDesc"))).click();
	  Thread.sleep(3000);
	  logger.info("DetailsFiltered");
	  driver.findElement(By.xpath(pro.getProperty("DescQueueSelected"))).click();
	  Thread.sleep(3000);
	  logger.info("DetailsQueueSelected");
	  driver.findElement(By.xpath(pro.getProperty("DescQueueSelected"))).click();
	  String StoreQueueDetail=driver.findElement(By.xpath(pro.getProperty("StoreQueueDate"))).getText();
	  System.out.println(StoreQueueDetail);
	  Thread.sleep(3000);
	  logger.info("StoreQueueDate");
	  String StoreBeneficiaryDetail=driver.findElement(By.xpath(pro.getProperty("StoreBeneficiaryID"))).getText();
	  System.out.println(StoreBeneficiaryDetail);
	  Thread.sleep(3000);
	  logger.info("StoreBeneficiaryID");
	 // driver.findElement(By.xpath(pro.getProperty("ViewSelectedQueue"))).click();
	  //Thread.sleep(3000);
	  
	  
	  
}
}
