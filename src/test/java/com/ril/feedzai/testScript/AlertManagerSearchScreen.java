package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class AlertManagerSearchScreen extends FeedzaiTestBaseClass 
{

	@BeforeMethod(description="Alert manager Search Screen")
	public void searchOpen() throws Exception
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("SearchTab"))).click();   
		Thread.sleep(10000);
		logger.info("Clicked on Search tab");

		TakeScreenshot.captuerScreenshot(driver, "Alert Manager search ");

		Thread.sleep(5000);

		driver.findElement(By.xpath(pro.getProperty("Search_date"))).clear();
		driver.findElement(By.xpath(pro.getProperty("Clear_txt"))).click(); 
		Thread.sleep(4000);

		driver.findElement(By.xpath(pro.getProperty("Advanced_search"))).click();
		logger.info("Clicked on Advanced search tab");

		TakeScreenshot.captuerScreenshot(driver, "Advance search ");


	}

	@Test(priority=24, description="Validate Advance search through customer id")
	public void AdvanceSearchCustID() throws Exception
	{

		logger1 = extent.createTest("Advance search through customer id");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ClickonCustId"))).click();
		logger.info("Clicked on customer id tab");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("inputCustID"))).sendKeys(pro.getProperty("CustID"));
		logger.info("Customer id entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputCustID"))).sendKeys(Keys.ENTER);
		logger.info("Customer information selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "customer id selection ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web=driver.findElement(By.xpath(pro.getProperty("CustIDValue"))).getText();
		System.out.println("Customer ID is :" +web);

		Assert.assertTrue(web.contains(pro.getProperty("CustID")));
		logger.info("Advance search through customer id successful");

		
}


	@Test(priority=25, description="Validate Advance search through Merchant id")
	public void AdvanceSearchMerID() throws Exception
	{

		logger1 = extent.createTest("Advance search through Merchant id");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ClickonMerID"))).click();
		logger.info("Clicked on Merchant id tab");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("inputMerID"))).sendKeys(pro.getProperty("MerchantID"));
		logger.info("Merchant id entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputMerID"))).sendKeys(Keys.ENTER);
		logger.info("Merchant information selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Merchant ID selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();

		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web1=driver.findElement(By.xpath(pro.getProperty("MerchIDValue"))).getText();
		System.out.println("Merchant ID is :" +web1);

		Assert.assertTrue(web1.contains(pro.getProperty("MerchantID")));
		logger.info("Advance search through Merchant id successful");



	}	

	@Test(priority=26, description="Validate Advance search through channel")
	public void AdvanceSearchChannel() throws Exception
	{

		logger1 = extent.createTest("Advance search through channel");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("ClickonChannel"))).click();
		logger.info("Clicked on Channel tab");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("inputChannel"))).sendKeys("P2M");
		logger.info("Channel entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputChannel"))).sendKeys(Keys.ENTER);
		logger.info("Channel value selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Channel selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(8000);

		String web2=driver.findElement(By.xpath(pro.getProperty("ChannelIDValue"))).getText();
		System.out.println("Channel is :" +web2);

		Assert.assertTrue(web2.contains(pro.getProperty("Channel")));
		logger.info("Advance search through channel successful");



	}	


	@Test(priority=27, description="Validate Advance search through Agent Id")
	public void AdvanceSearchAgentID() throws Exception
	{

	logger1 = extent.createTest("Advance search through Agent Id"); 
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("ClickonAgentID"))).click();
		logger.info("Clicked on Agent ID tab");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("inputAgentID"))).sendKeys(pro.getProperty("AgentID"));
		logger.info(" Agent ID entered");
		Thread.sleep(15000);
		driver.findElement(By.xpath(pro.getProperty("inputAgentID"))).sendKeys(Keys.ENTER);
		logger.info("Agent ID selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Agent Id selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web3=driver.findElement(By.xpath(pro.getProperty("AgentIDValue"))).getText();
		System.out.println("Agent ID is :" +web3);

		Assert.assertTrue(web3.contains(pro.getProperty("AgentID")));
		logger.info("Advance search through Agent ID successful");

		driver.navigate().refresh();
		Thread.sleep(12000);
		logger.info("Page refreshed");	

	}



	@Test(priority=28, description="Validate Advance search through customer phone number")
	public void AdvanceSearchCusNum() throws Exception
	{

		logger1 = extent.createTest("dvance search through customer phone no");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickonCustId"))).click();
		logger.info("Clicked on customer id tab");
		Thread.sleep(3000);

		driver.findElement(By.xpath(pro.getProperty("inputCustID"))).sendKeys(pro.getProperty("CustPhoneNumber"));
		logger.info("Customer phone number entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputCustID"))).sendKeys(Keys.ENTER);
		logger.info("Customer phone number selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Customer phone number selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web4=driver.findElement(By.xpath(pro.getProperty("CustNoValue"))).getText();
		System.out.println("Customer phone number is :" +web4);

		Assert.assertTrue(web4.contains(pro.getProperty("CustPhoneNumber")));
		logger.info("Advance search through Customer phone number successful");

		
	}

	@Test(priority=29, description="Validate Advance search through merchant phone number")
	public void AdvanceSearchMerNum() throws Exception
	{

		logger1 = extent.createTest("Advance search through merchant phone no");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickonMerID"))).click();
		logger.info("Clicked on merchant id tab");
		Thread.sleep(3000);

		driver.findElement(By.xpath(pro.getProperty("inputMerID"))).sendKeys(pro.getProperty("MerchantPhoneNum"));
		logger.info("Merchant phone number entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputMerID"))).sendKeys(Keys.ENTER);
		logger.info("Merchant phone number selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Merchant phone number selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web5=driver.findElement(By.xpath(pro.getProperty("MerchNoValue"))).getText();
		System.out.println("Merchant phone number is :" +web5);

		Assert.assertTrue(web5.contains(pro.getProperty("MerchantPhoneNum")));
		logger.info("Advance search through Merchant phone number successful");



	}

	@Test(priority=30, description="Validate Advance search through Source Institution ID")
	public void AdvanceSearchSrcInstID() throws Exception
	{

	logger1 = extent.createTest("Advance search through Source Institution ID");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("inputSrcInstID"))).sendKeys(pro.getProperty("SourceInstID"));
		logger.info("source institution id entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputSrcInstID"))).sendKeys(Keys.ENTER);
		logger.info("source institution id selected");
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Source institution id selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(8000);

		String web6=driver.findElement(By.xpath(pro.getProperty("SrcInstIDValue"))).getText();
		System.out.println("Source Institution ID is :" +web6);

		Assert.assertTrue(web6.contains(pro.getProperty("SourceInstID")));
		logger.info("Advance search through Source Institution ID successful");



	}


	@Test(priority=31, description="Validate Advance search through response code")
	public void AdvanceSearchResponseCode() throws Exception
	{

		logger1 = extent.createTest("Advance search through response code");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickonRespCode"))).click();
		logger.info("Clicked on response code tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputRespCode"))).sendKeys("00");
		logger.info("response code entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputRespCode"))).sendKeys(Keys.ENTER);
		logger.info("response code selected");
		Thread.sleep(5000);
		TakeScreenshot.captuerScreenshot(driver, "Response code selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(8000);

		String web7=driver.findElement(By.xpath(pro.getProperty("ResponseCodeValue"))).getText();
		System.out.println("Response code is :" +web7);

		Assert.assertTrue(web7.contains(pro.getProperty("ResponseCode")));
		logger.info("Advance search through Response code successful");


	}


	@Test(priority=32, description="Validate Advance search through Processing code")
	public void AdvanceSearchProcessCode() throws Exception
	{

		logger1 = extent.createTest("Advance search through Processing code");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickProcessCode"))).click();
		logger.info("Clicked on type tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputProcessCode"))).sendKeys("45");
		logger.info("Type entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputProcessCode"))).sendKeys(Keys.ENTER);
		logger.info("Type value selected");
		Thread.sleep(5000);
	TakeScreenshot.captuerScreenshot(driver, "Processing code selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(8000);

		String web9=driver.findElement(By.xpath(pro.getProperty("ProcessCodeValue"))).getText();
		System.out.println("Processing code is :" +web9);

		Assert.assertTrue(web9.contains(pro.getProperty("ProcessingCode")));
		logger.info("Advance search through Processing code successful");




	}

	@Test(priority=33, description="Validate Advance search through Hashed card pan")
	public void AdvanceSearchHashedCardPan() throws Exception
	{

	logger1 = extent.createTest("Advance search through Hashed card pan");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickonHashCrdPan"))).click();
		logger.info("Clicked on hashed card pan tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputHashCrdPan"))).sendKeys(pro.getProperty("Hashed_Card_pan"));
		logger.info("hashed card pan entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputHashCrdPan"))).sendKeys(Keys.ENTER);
		logger.info("hashed card pan value selected");
		Thread.sleep(5000);
		TakeScreenshot.captuerScreenshot(driver, "Hashed card pan selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);

		String web9=driver.findElement(By.xpath(pro.getProperty("HashedValue"))).getText();
		System.out.println("Hashed card pan value is :" +web9);

		Assert.assertTrue(web9.contains(pro.getProperty("Hashed_Card_pan")));
		logger.info("Advance search through Hashed Card pan successful");



	}

	@Test(priority=34, description="Validate Advance search through Customer App ID")
	public void AdvanceSearchCustAppID() throws Exception
	{

		logger1 = extent.createTest("Advance search through Customer App ID");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickonCustAppID"))).click();
		logger.info("Clicked on Customer App ID tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("InputCustAppID"))).sendKeys(pro.getProperty("CustomerAppID"));
		logger.info("Customer App ID entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("InputCustAppID"))).sendKeys(Keys.ENTER);
		logger.info("Customer App ID value selected");
		Thread.sleep(6000);
	TakeScreenshot.captuerScreenshot(driver, "Customer App id selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);

		String web10=driver.findElement(By.xpath(pro.getProperty("CustAppIdValue"))).getText();
		System.out.println("Customer APP id value is :" +web10);

		Assert.assertTrue(web10.contains(pro.getProperty("CustomerAppID")));
		logger.info("Advance search through Customer App ID successful");



	}

	@Test(priority=35, description="Validate Advance search through Sender pan or Card pan")
	public void AdvanceSearchSenderPan() throws Exception
	{

	logger1 = extent.createTest("Advance search through Sender pan or Card pan");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickSenderPan"))).click();
		logger.info("Clicked on Sender pan tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputSenderPan"))).sendKeys(pro.getProperty("SenderPan"));
		logger.info("Sender pan or card pan entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputSenderPan"))).sendKeys(Keys.ENTER);
		logger.info("Sender pan or card pan value selected");
		Thread.sleep(6000);
	TakeScreenshot.captuerScreenshot(driver, "Sender pan selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);

		String web11=driver.findElement(By.xpath(pro.getProperty("SenderPanValue"))).getText();
		System.out.println("Sender pan value is :" +web11);

		Assert.assertTrue(web11.contains(pro.getProperty("SenderPan")));
		logger.info("Advance search through Sender pan successful");


	}


	@Test(priority=36, description="Validate Advance search through Card bin")
	public void AdvanceSearchCardBin() throws Exception
	{

		logger1 = extent.createTest("Advance search through Card bin");
		Thread.sleep(7000);
		driver.findElement(By.xpath(pro.getProperty("ClickCardBin"))).click();
		logger.info("Clicked on Card bin tab");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputCardBin"))).sendKeys(pro.getProperty("CardBin"));
		logger.info("Card bin entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("inputCardBin"))).sendKeys(Keys.ENTER);
		logger.info("Card bin value selected");
		Thread.sleep(6000);
	TakeScreenshot.captuerScreenshot(driver, "Card bin selection");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("searchButton"))).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(10000);
		driver.findElement(By.xpath(pro.getProperty("FirstView"))).click();
		logger.info("Viewing transaction..");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);

		String web12=driver.findElement(By.xpath(pro.getProperty("CardBinValue"))).getText();
		System.out.println("Card bin value is :" +web12);

		Assert.assertTrue(web12.contains(pro.getProperty("CardBin")));
		logger.info("Advance search through Card bin successful");



	}


}
