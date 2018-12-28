package com.niit.cleartrip.webdriverutil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.niit.cleartrip.applicationconstants.ApplicationConstants;
import com.niit.cleartrip.commonfunctions.LaunchWebSite;


public class WebDriverInitialization {
	WebDriver driver;
	static Logger log=Logger.getLogger("WebDriverInitialization");
	
	
	public WebDriverInitialization(){
		driver=LaunchWebSite.nativatingTO_URL();
		driver.get(ApplicationConstants.URL);
	}
	
	
	public WebElement FINDELEMENT(String byvalue){
		WebElement webelement=null;
		log.info("Looking for WebElement :"+byvalue);
		try {
			webelement=driver.findElement(ByClass.getByValue(byvalue));
			log.info("WebElement is Identified :"+byvalue);
			return webelement ;
		} catch (IOException e) {
			log.info("WebElement is not Identified and showing Error :"+byvalue);
			e.printStackTrace();
		}
		return webelement;
	}
	public void GET(String arg){
		driver.get(arg);
	}
	public void SENDKEYS(String byvalue,String testData){
		log.info("Sending Value is :"+testData);
		FINDELEMENT(byvalue).sendKeys(testData);
	}
	public void clear(String byvalue){
		log.info("Clear the Input Box");
		FINDELEMENT(byvalue).clear();
	}
	public void click(String byvalue){
		log.info("Click on the WebElement: "+byvalue);
		FINDELEMENT(byvalue).click();
	}
	public void acceptAlert(){
		driver.switchTo().alert().accept();
	}
	public void dismisss(){
		driver.switchTo().alert().dismiss();
	}
	public String getAlertText(){
		String alertText=driver.switchTo().alert().getText();
		return alertText;
	}
	public void SELECTBYVALUE(String byvalue,String arg){
		Select sel=new Select(FINDELEMENT(byvalue));
		sel.selectByValue(arg);
	}
	public void SELECTBYVISIBLETEXT(String byvalue,String arg){
		Select sel=new Select(FINDELEMENT(byvalue));
		sel.selectByVisibleText(arg);
	}
	public void SWITCHTOFRAME_BYUSING_INDEX(int index){
		driver.switchTo().frame(index);
	}
	public void SWITCHTOFRAME_BYUSING_WEBELEMENT(String byvalue){
		driver.switchTo().frame(FINDELEMENT(byvalue));
	}
	public void SWITCHTOFRAME_BYUSING_NAME(String byvalue){
		driver.switchTo().frame(byvalue);
	}
	public void SWITCHTODEFAULTCONTENT(){
		driver.switchTo().defaultContent();
	}
	public void implicitwait(int arg){
		driver.manage().timeouts().implicitlyWait(arg, TimeUnit.SECONDS);
	}
	

}
