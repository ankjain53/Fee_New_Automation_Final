package com.ril.Feedzai.Archieve;


import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.ril.Feedzai.Utility.WebElementListener;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.BeforeClass;



public class Feedzai_Pulse_Login 
{

     public static WebDriver driver;
     public static  Logger logger;
     public  static Properties pro;
     public static EventFiringWebDriver e_driver;
 	 public static WebDriverEventListener eventListener;
 	 public static ExtentReports extent;

       
@BeforeClass  (description="Read data from Config file")

public void Log_Config_Data() throws Exception
{
       File Src= new File (".\\src\\main\\java\\com\\ril\\Feedzai\\Config\\Config.Properties");
       FileInputStream fis=new FileInputStream(Src);
       pro = new Properties();
       pro.load(fis);
         
       logger=Logger.getLogger("feedzai_pulse_Login");
       PropertyConfigurator.configure(".\\src\\main\\java\\com\\ril\\Feedzai\\Config\\log4j.properties");
       
       System.setProperty("webdriver.chrome.driver","D://Chrome Driver 2.38//chromedriver_win32//chromedriver.exe");
   	   driver=new ChromeDriver();
       logger.info("Browser Opened");  
       
          // Initializing EventFiringWebDriver using Firefox WebDriver instance
    		e_driver = new EventFiringWebDriver(driver);

    		// Now create object of EventListerHandler to register it with EventFiringWebDriver
    		eventListener = new WebElementListener();

    		e_driver.register(eventListener);
         	driver=e_driver;
       
       driver.get("https://10.130.236.50/pulseviews/management/#apps/reliance/dataconfiguration");
       Thread.sleep(9000);
                     
                    
       driver.manage().window().maximize(); 
       Thread.sleep(2000);
            
       
}
       
       
      
       
                  
       
}

  
  


