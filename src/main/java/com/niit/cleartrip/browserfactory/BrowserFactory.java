package com.niit.cleartrip.browserfactory;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.niit.cleartrip.applicationconstants.ApplicationConstants;
import com.niit.cleartrip.fileoperations.LoadProperties;

public class BrowserFactory {	
	public static WebDriver driver;
	static Logger logger=Logger.getLogger("BrowserFactory");
	public static WebDriver getdesiredbrowser(){
		try{
			switch(LoadProperties.getDerivedProperty(ApplicationConstants.BROWSER).toUpperCase()){
			case"CHROME":
				driver=BrowserFactory.chrome();
				break;
			case"FIREFOX":
				driver=BrowserFactory.firefox();
				break;
			case"IE":
				driver=BrowserFactory.IE();
				break;
				default:
					driver=BrowserFactory.chrome();
					break;		
			}
		}catch(Exception exception){
			logger.error("Browser Variable getting as Exception :"+exception);
		}
		driver.get(ApplicationConstants.URL);
		return driver;
		
	}
	public static WebDriver chrome(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\chromedriver.exe");
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();      
		handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		logger.info("=========Browser Object is Created============");
		driver=new ChromeDriver();
		logger.info("=========CHROME Browser is Opened============");
		driver.manage().window().maximize();
		logger.info("=========CHROME Browser is Maximised============");
		return driver;
	}
	public static WebDriver firefox(){
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		logger.info("=========Browser Object is Created============");
		driver = new FirefoxDriver();
		logger.info("=========Firefox Browser is Opened============");
		driver.manage().window().maximize();
		logger.info("=========CHROME Browser is Maximised============");
		return driver;
		
	}
	public static WebDriver IE(){
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		logger.info("=========Browser Object is Created============");
		driver = new InternetExplorerDriver();
		logger.info("=========Firefox Browser is Opened============");
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		driver.findElement(By.id("overridelink")).click();
		driver.manage().window().maximize();
		logger.info("=========CHROME Browser is Maximised============");
		return driver;
		
	}
	public static void main(String[] args) {
		BrowserFactory.getdesiredbrowser();
	}


}
