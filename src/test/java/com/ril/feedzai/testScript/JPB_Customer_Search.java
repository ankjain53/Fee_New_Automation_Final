package com.ril.feedzai.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class JPB_Customer_Search extends FeedzaiTestBaseClass

{

	@Test(priority=47,description="JPB Profile Search with Customer_number")

	public void Customer_Search_CIFID() throws Exception
	{
		logger1 = extent.createTest("JPB Profile Search with Customer_number");
		Thread.sleep(4000);

		driver.findElement(By.xpath(pro.getProperty("CustomerTab"))).click();
		logger.info("Clicked on Customer Tab");
		driver.findElement(By.xpath(pro.getProperty("JPB_Radio"))).click();
		logger.info("Clicked on JPB Radio button");		
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("SearchForCust1"))).sendKeys(pro.getProperty("Customer_id1"));
		logger.info("Entered Customer ID");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("click_customer"))).click();	
		logger.info("Clicked on customer Details");			

	}

	@Test(priority=48,description="JPB Customer Details")

	public void Customer_Details_CIFID() throws Exception
	{

		logger1 = extent.createTest("JPB Customer Details");

		WebElement web=driver.findElement(By.xpath(pro.getProperty("Customer_details")));
		String st=web.getText();
		Thread.sleep(4000);
		System.out.println("Customer Details are =" +st);
		Assert.assertTrue(st.contains("Neeraj Jain"));
		logger.info("JPB Customer name details displayed ");
		Assert.assertTrue(st.contains(pro.getProperty("Customer_id1")));
		logger.info("JPB Customer details displayed ");
		Assert.assertTrue(st.contains("8446974489"));
		logger.info("JPB Mobile number details displayed ");
		Assert.assertTrue(st.contains("2"));
		logger.info("JPB customer risk details displayed ");	

	}


	@Test(priority=49,description="JPB Profile Search with Account_number")

	public void Customer_Details_Account_Number() throws Exception
	{

		logger1 = extent.createTest("JPB Profile Search with Account_number");
		driver.findElement(By.xpath(pro.getProperty("CustomerTab"))).click();
		logger.info("Clicked on Customer Tab");
		driver.findElement(By.xpath(pro.getProperty("JPB_Radio"))).click();
		logger.info("Clicked on JPB Radio button");		
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("SearchForCust1"))).sendKeys(pro.getProperty("Account_number1"));
		logger.info("Entered Customer ID");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("click_customer"))).click();	
		logger.info("Clicked on customer Details");


	} 


	@Test(priority=50,description="JPB Account Details")

	public void Customer_Details_Account_Details() throws Exception
	{

		logger1 = extent.createTest("JPB Account Details");
		WebElement dt =driver.findElement(By.xpath(pro.getProperty("Account_dt")));
		String Acc_det=dt.getText();
		System.out.println("Account details of customer =" + Acc_det);

		Assert.assertTrue(Acc_det.contains(pro.getProperty("Account_number1")));
		logger.info("JPB account number displayed ");
		Assert.assertTrue(Acc_det.contains("CDMZK6620B"));
		logger.info("JPB Customer POI ID displayed ");
		Assert.assertTrue(Acc_det.contains("146172627164"));
		logger.info("JPB POA details displayed ");
		Assert.assertTrue(Acc_det.contains("PAN"));
		logger.info("JPB POA Name displayed ");	 	

	} 


	@Test(priority=51,description="JPB Customer activity period details")

	public void Activity_Period() throws Exception
	{

		logger1 = extent.createTest("JPB Customer activity period details");
		WebElement act =driver.findElement(By.xpath(pro.getProperty("Activity_tab")));
		String Activity_period=act.getText();
		System.out.println("Customer activity period details =" + Activity_period);	

	} 

	@Test(priority=52,description="JPB Customer transactions Details ")

	public void Transactions_Details() throws Exception
	{

		logger1 = extent.createTest("JPB Customer transactions Details");
		WebElement td =driver.findElement(By.xpath(pro.getProperty("Tran_details")));
		String tran_dt=td.getText();
		System.out.println("Customer transactions Details =" + tran_dt);

	} 


	@Test(priority=53,description="JPB Customer Fraud Details")

	public void Fraud_Details() throws Exception
	{

		logger1 = extent.createTest("JPB Customer Fraud Details");
		WebElement fd =driver.findElement(By.xpath(pro.getProperty("Fraud_dt")));
		String Fraud_dt=fd.getText();
		System.out.println("Customer Fraud Details =" + Fraud_dt);  		

	} 


	@Test(priority=54,description="JPB Transactions Transaction Density Details")

	public void Tran_density() throws Exception
	{

		logger1 = extent.createTest("JPB Transactions Transaction Density Details");  			
		Boolean my_element = driver.findElement(By.xpath(pro.getProperty("Tran_density"))).isDisplayed();
		Assert.assertTrue(my_element,"Customer Density graph is not displayed"); 	
		logger.info("JPB Customer Density graph is displayed ");

	} 

	@Test(priority=55,description="JPB Customer transaction Statistic")

	public void transaction_Statistic() throws Exception
	{

		logger1 = extent.createTest("JPB Customer transaction Statistic"); 
		Boolean my_element2 = driver.findElement(By.xpath(pro.getProperty("Tran_statistic"))).isDisplayed();
		Assert.assertTrue(my_element2,"Customer Statistics graph is not displayed");
		logger.info("JPB Customer transaction Statistic is displayed ");
	}   

	@Test(priority=56,description="JPB Customer transaction History")

	public void transaction_History() throws Exception
	{
		logger1 = extent.createTest("JPB Customer transaction History"); 
		WebElement my_element3 = driver.findElement(By.xpath(pro.getProperty("Tran_history")));
		String Hist=my_element3.getText();
		Assert.assertTrue(Hist.contains(pro.getProperty("Customer_id1")));
		logger.info("JPB Customer History is displayed ");
	}   

	@Test(priority=57,description="JPB Customer Status Log Details")

	public void Status_Log_Details() throws Exception
	{

		logger1 = extent.createTest("JPB Customer Status Log Details");
		driver.findElement(By.xpath(pro.getProperty("Cust_status_log"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Cust_Status_log_Src"))).click();

		Boolean my_element4 = driver.findElement(By.xpath(pro.getProperty("Status_tran_dt"))).isDisplayed();
		Assert.assertTrue(my_element4,"Customer transaction History is not displayed");
		logger.info("JPB Customer transaction History is displayed ");

		driver.findElement(By.xpath(pro.getProperty("close"))).click();	
		//driver.quit();

	}  

	@Test(priority=58,description="JPB-Jio Money Customer Search")

	public void JM_Customer_Search() throws Exception
	{
		logger1 = extent.createTest("JPB-Jio Money Customer Search");
		driver.findElement(By.xpath(pro.getProperty("JM_cust_Search"))).sendKeys(pro.getProperty("JM_ID"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("JM_cust_dt"))).click();
		WebElement jm=driver.findElement(By.xpath(pro.getProperty("JM_cust_details")));
		String jpb_jm=jm.getText();
		System.out.println("Sender pan Details are =" +jpb_jm);
		Assert.assertTrue(jpb_jm.contains(pro.getProperty("JM_ID")));
		logger.info("Jio Money Customer  History is displayed ");


	}   

	




} 





