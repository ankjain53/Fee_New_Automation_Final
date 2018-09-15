package com.ril.feedzai.testScript;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.TakeScreenshot;



public class FeedzaiPulseHomePage extends FeedzaiTestBaseClass

{

	@BeforeClass

	public void feedzai_Login() throws Exception
	{

		driver.get("https://10.130.236.50/pulseviews/management/#apps/reliance/dataconfiguration");
		Thread.sleep(9000);


		driver.manage().window().maximize(); 
		Thread.sleep(2000);

		driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("MyUserName"));

		logger.info("UserName Entered");

		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("MyPassword"));
		logger.info("Password Entered");

		driver.findElement(By.xpath(pro.getProperty("SignIn"))).click();
		Thread.sleep(10000);
		logger.info("Clicked on SignIn");
		logger.info("User logged in successfully");
		TakeScreenshot.captuerScreenshot(driver, "PulseLogin");


	}


	@Test (priority=80 ,groups= {"Home Page"},description="Pulse Application HealthCheck")

	public void Healthcheck() throws Exception
	{

		logger1 = extent.createTest("Pulse Application HealthCheck");
		driver.findElement(By.xpath(pro.getProperty("Application"))).click();


		logger.info("Clicked on Application tab");

		Thread.sleep(1000);

		WebElement x = driver.findElement(By.xpath(pro.getProperty("Healthchk")));

		String ActualToolTip1=x.getAttribute("data-original-title");

		Assert.assertEquals("Application is On. Click to turn Off.", ActualToolTip1, "Application is Unhealthy-Restart the Application");

		logger.info("Feedzai Pulse application is up and running");

		driver.findElement(By.xpath(pro.getProperty("Healthchk1"))).click();

		TakeScreenshot.captuerScreenshot(driver, "Pulse Health Checkup");

		Thread.sleep(1000);


	}


	@Test(priority=81 ,description="Pulse Version check")

	public void PulseVersion() throws Exception
	{

		logger1 = extent.createTest("Pulse Version check");
		WebElement web=driver.findElement(By.xpath(pro.getProperty("Pulse_version")));
		String Version_value=web.getText();
		System.out.println("Pulse Version is :" + Version_value);

		logger.info("Pulse Version is Printed");

		TakeScreenshot.captuerScreenshot(driver,"Pulse Health Checkup");

	}


	// ******Distribution Job**********

	@Test(priority=82 ,description="Pulse Distribution job execution status")

	public void DistributionJob() throws Exception
	{
		logger1 = extent.createTest("Pulse Distribution job execution status");
		driver.findElement(By.xpath(pro.getProperty("Modles"))).click();
		logger.info("Clicked on Modles Tab");


		driver.findElement(By.xpath(pro.getProperty("Job"))).click();
		logger.info("Clicked on Job Tab");

		  driver.findElement(By.xpath(pro.getProperty("Job_RFG"))).click();
	   logger.info("Reliance Profile Generation - At 0:00 AM (10)");

	   WebElement x= driver.findElement(By.xpath(pro.getProperty("Job_RFG_Status")));
	   String Status=x.getText();
	   System.out.println("Job Status=" + Status);
	   logger.info("Print Status");

	   WebElement y =driver.findElement(By.xpath(pro.getProperty("Job_RFG_Status_date_time")));
	   String run_status=y.getText();
	   System.out.println("Job Run Date and time =" + run_status);
	   logger.info("Printed Distribution job last run status");

	} 

	@Test(priority=83 ,description="Enable Time Machine")

	public void EnableTimeMachine() throws Exception
	{

		logger1 = extent.createTest("Enable Time Machine");

		JavascriptExecutor js = (JavascriptExecutor) driver;  

		driver.findElement(By.xpath(pro.getProperty("Data_config"))).click();
		logger.info("Clicked on Data_config");

		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath(pro.getProperty("Data_config_p2"))).click();
		logger.info("Clicked on Data_config Page 2");

		Thread.sleep(8000);
		driver.findElement(By.xpath(pro.getProperty("Data_config_p2_FIS"))).click();
		logger.info("Clicked on FIS input Adaptor"); 

		js.executeScript("window.scrollBy(0,100)");

		Thread.sleep(1000);

		driver.findElement(By.xpath(pro.getProperty("time_machine"))).click();
		driver.findElement(By.xpath(pro.getProperty("input_tm"))).sendKeys("true");

		logger.info("TimeMachine value is set to true");

		driver.findElement(By.xpath(pro.getProperty("time_machine_en"))).click();
		logger.info("Time Machine Enabled");

		driver.findElement(By.xpath(pro.getProperty("TM_save"))).click();
		logger.info("Clicked on Save");

		TakeScreenshot.captuerScreenshot(driver,"TimeMachine Enable");

	}	




	@AfterClass (description="Feedzai Pulse logout")

	public void feedzai_Logout() throws InterruptedException
	{
		driver.findElement(By.xpath(pro.getProperty("Logout_UserName"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(pro.getProperty("Logout"))).click();
		logger.info("Logged out Sucessfully");
		driver.quit();

	}



}

