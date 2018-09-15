package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class JPB_Advance_Search extends FeedzaiTestBaseClass

{

	@BeforeClass
	
	public void AdvanceSearchSetup()
	{
		driver.findElement(By.xpath(pro.getProperty("Search_tab"))).click();
		
		
	}
	
	@BeforeMethod(description="JPB Advanced Search ")

	public void Advance_Search() throws Exception
	{

		logger1 = extent.createTest("JPB Advanced Search ");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Search_date"))).clear();
		driver.findElement(By.xpath(pro.getProperty("Clear_txt"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Ad_Search"))).click();    
	}

	@Test(priority=43,description="JPB Advanced Search Sender PAN")

	public void Sender_pan() throws Exception 
	{

		driver.findElement(By.xpath(pro.getProperty("JPB_Sender_pan"))).sendKeys(pro.getProperty("Sender_PAN_no"));

		driver.findElement(By.xpath(pro.getProperty("Ad_Search_in"))).click();

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,100)");
		String span = driver.findElement(By.xpath(pro.getProperty("AD_tran_details"))).getText();

		System.out.println("Sender pan Details are =" +span);
		Assert.assertTrue(span.contains(pro.getProperty("Sender_PAN_no")));
		logger.info("JPB Sender pan detail is displayed ");	

		driver.navigate().refresh();

		Thread.sleep(2000);


	}



	@Test(priority=44,description="JPB Advanced Search Beneficiary PAN")

	public void Beneficiary_pan() throws Exception
	{
		driver.findElement(By.xpath(pro.getProperty("JPB_Benef_pan"))).sendKeys(pro.getProperty("Beneficiary_PAN_no"));
		driver.findElement(By.xpath(pro.getProperty("Ad_Search_in"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,100)");
		String Bpan = driver.findElement(By.xpath(pro.getProperty("AD_tran_details"))).getText();

		System.out.println("Sender pan Details are =" +Bpan);
		Assert.assertTrue(Bpan.contains(pro.getProperty("Beneficiary_PAN_no")));
		logger.info("JPB Beneficiary pan detail is displayed ");	

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(priority=45,description="JPB Advanced Search Sender MMID ")

	public void Sender_MMID() throws Exception
	{

		driver.findElement(By.xpath(pro.getProperty("JPB_Sender_MMID"))).sendKeys(pro.getProperty("Sender_MMID"));
		driver.findElement(By.xpath(pro.getProperty("Ad_Search_in"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,100)");
		String SMMID = driver.findElement(By.xpath(pro.getProperty("AD_tran_details"))).getText();

		System.out.println("Sender pan Details are =" +SMMID);
		Assert.assertTrue(SMMID.contains(pro.getProperty("Sender_MMID_1")));
		logger.info("JPB Sender MMID detail are displayed ");	

		driver.navigate().refresh();
		Thread.sleep(2000);
	}


	@Test(priority=46,description="JPB Advanced Search Beneficiary MMID ")

	public void Beneficiary_MMID() throws Exception
	{

		driver.findElement(By.xpath(pro.getProperty("JPB_Benef_MMID"))).sendKeys(pro.getProperty("Benef_MMID"));
		driver.findElement(By.xpath(pro.getProperty("Ad_Search_in"))).click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,100)");
		String BMMID = driver.findElement(By.xpath(pro.getProperty("AD_tran_details"))).getText();

		System.out.println("Sender pan Details are =" +BMMID);
		Assert.assertTrue(BMMID.contains(pro.getProperty("Benef_MMID")));
		logger.info("JPB Beneficiary MMID detail is displayed ");	

		driver.navigate().refresh();
		Thread.sleep(2000);

	} 

}
