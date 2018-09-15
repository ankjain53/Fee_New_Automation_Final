package com.ril.feedzai.testScript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;



public class AlertManagerCustomerScreen extends FeedzaiTestBaseClass {

	@BeforeClass(description="Customer Search Home Screen")
	public void customerSearch() throws Exception
	{
		driver.findElement(By.xpath(pro.getProperty("CustomerTab"))).click();   
		Thread.sleep(10000);
		logger.info("Clicked on Customer tab");
		TakeScreenshot.captuerScreenshot(driver, "Customer Tab Selected ");
	}

	@Test(priority=8, description="Customer Search through mobile number")
	public void custMobNumSearch() throws Exception
	{
		logger1 = extent.createTest("Customer Search through mobile number");
		driver.findElement(By.xpath(pro.getProperty("SearchForCust"))).sendKeys(pro.getProperty("CustMobNum"));
		Thread.sleep(10000);
		logger.info("Customer Mobile number entered");
		TakeScreenshot.captuerScreenshot(driver, "Customer Mobile No Entered ");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("getCustomer"))).click();
		Thread.sleep(10000);
		logger.info("Customer information obtained");
		TakeScreenshot.captuerScreenshot(driver, "Customer Information Found ");
	}

	@Test(priority=9, description="Customer Search through Customer ID")
	public void custIdSearch() throws Exception
	{
		logger1 = extent.createTest("Customer Search through Customer ID");  
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("CustomerTab"))).click();   
		Thread.sleep(10000);
		logger.info("Clicked on Customer tab again");

		driver.findElement(By.xpath(pro.getProperty("SearchForCust"))).sendKeys(pro.getProperty("CustID"));
		Thread.sleep(5000);
		logger.info("Customer ID entered");

		// Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("getCustomer"))).click();
		Thread.sleep(9000);
		logger.info("Customer information obtained");
		TakeScreenshot.captuerScreenshot(driver, "Customer Information Found via ID ");
	}

	@Test(priority=10, description="Customer Detail Validation")
	public void custNameValidate() throws Exception
	{
		logger1 = extent.createTest("Customer Detail Validation");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Expected_CustDetail")));
		String y=web.getText();
		System.out.println( y);
		TakeScreenshot.captuerScreenshot(driver, "Complete Customer Details Captured ");
	}

	@Test(priority=11, description="Transaction Density Validation")
	public void custIDValidate() throws Exception
	{
		logger1 = extent.createTest("Transaction Density Validation");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Cust_TransactionDensity")));
		String y=web.getText();
		System.out.println(y);

	}

	@Test(priority=12, description="Activity Period Validation")
	public void custAccNumValidate() throws Exception
	{
		logger1 = extent.createTest("Activity Period Validation");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Cust_ActivityPeriod")));
		String y=web.getText();
		System.out.println(y);

	}


	@Test(priority=13, description="Transactions Details Validation")
	public void custKycValidate() throws Exception
	{
		logger1 = extent.createTest("Transactions Details Validation");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Cust_TransDetail")));
		String y=web.getText();
		System.out.println(y);

	}

	@Test(priority=14, description="Fraud  Details Validation")
	public void custStatusValidate() throws Exception
	{
		logger1 = extent.createTest("Fraud  Details Validation");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Cust_FraudDetail")));
		String y=web.getText();
		System.out.println(y);

	}

	@Test(priority=15, description="Customer Transaction History")
	public void custAppIDValidate() throws Exception
	{
		logger1 = extent.createTest("custAppIDValidate");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Cust_TransactionHistory")));
		String y=web.getText();
		System.out.println( y);

	}


	/*@Test(priority=16, description="Customer Transaction Density Validation ")
	public void custTransDensityValidate() throws Exception
	{
		 Boolean my_element = driver.findElement(By.xpath(pro.getProperty("Transaction_Density"))).isDisplayed();

		Assert.assertTrue(my_element,"Customer Transaction density map is not displayed"); 
		logger.info("Customer Transaction density map is displayed ");
		//driver.quit();
	} */


	@Test(priority=17, description="Customer Transaction History")
	public void custTransStatisticsValidate() throws Exception
	{
		logger1 = extent.createTest("custTransStatisticsValidate");
		Boolean my_element = driver.findElement(By.xpath(pro.getProperty("Transaction_statistics"))).isDisplayed();
		Assert.assertTrue(my_element,"Customer Transaction Statistics graph is not displayed"); 
		logger.info("Customer Transaction Statistics graph is displayed ");

	}


	@Test(priority=18, description="Merchant Statistics in Customer tab Validation")
	public void custMerchStatisticsValidate() throws Exception
	{
		logger1 = extent.createTest("Merchant Statistics in Customer tab Validation");
		Boolean my_element = driver.findElement(By.xpath(pro.getProperty("Merchant_statistics"))).isDisplayed();

		Assert.assertTrue(my_element,"Merchant Statistics graph in Customer tab is not displayed"); 
		logger.info("Merchant Statistics graph in Customer tab is  displayed ");

	}


} 




