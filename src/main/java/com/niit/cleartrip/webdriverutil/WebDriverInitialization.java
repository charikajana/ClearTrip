package com.niit.cleartrip.webdriverutil;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.niit.cleartrip.browserfactory.BrowserFactory;
import com.niit.cleartrip.fileoperations.LoadProperties;


public class WebDriverInitialization {//Updated with the latest one passed by Chari - 1/6
	WebDriver driver;
	static Logger log=Logger.getLogger("WebDriverInitialization");
	
	public WebDriver getcurrentDriver(){
		if(driver==null){
			driver=BrowserFactory.getdesiredbrowser();
		}
		return driver;
	}
	
	public WebElement FINDELEMENT(String byvalue){
		WebElement webelement=null;
		log.info("Looking for WebElement :"+byvalue);
		try {
			webelement=getcurrentDriver().findElement(ByClass.getByValue(byvalue));
			log.info("WebElement is Identified :"+byvalue);
			return webelement ;
		} catch (IOException e) {
			log.info("WebElement is not Identified and showing Error :"+byvalue);
			e.printStackTrace();
		}
		return webelement;
	}
	public void GET(String arg){
		getcurrentDriver().get(arg);
	}
	public void SENDKEYS(String byvalue,String testData){
		try{
			log.info("Sending Value is :"+testData);
			FINDELEMENT(byvalue).sendKeys(LoadProperties.getDerivedProperty(testData));
		}catch(Exception e){
			log.log(Level.INFO,e.getMessage());
			
		}
		
	}
	public void clear(String byvalue){
		log.info("Clear the Input Box");
		FINDELEMENT(byvalue).clear();
	}
	public void click(String byvalue){
		WebElement element=FINDELEMENT(byvalue);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public void acceptAlert(){
		getcurrentDriver().switchTo().alert().accept();
	}
	public void dismisss(){
		getcurrentDriver().switchTo().alert().dismiss();
	}
	public String getAlertText(){
		String alertText=getcurrentDriver().switchTo().alert().getText();
		return alertText;
	}
	public void SELECTBYVALUE(String byvalue,String arg){
		try{
			log.info("Trying to Select the Value from Drop Down");
			Select sel=new Select(FINDELEMENT(byvalue));
			sel.selectByValue(LoadProperties.getDerivedProperty(arg));	
		}catch(Exception e){
			
		}
		
	}
	public void SELECTBYVISIBLETEXT(String byvalue,String arg){
		try{
			log.info("Trying to Select the Value from Drop Down");
			Select sel=new Select(FINDELEMENT(byvalue));
			sel.selectByVisibleText(LoadProperties.getDerivedProperty(arg));
		}catch(Exception e){
			
		}
		
	}
	public void SWITCHTOFRAME_BYUSING_INDEX(int index){
		getcurrentDriver().switchTo().frame(index);
	}
	public void SWITCHTOFRAME_BYUSING_WEBELEMENT(String byvalue){
		getcurrentDriver().switchTo().frame(FINDELEMENT(byvalue));
	}
	public void SWITCHTOFRAME_BYUSING_NAME(String byvalue){
		getcurrentDriver().switchTo().frame(byvalue);
	}
	public void SWITCHTODEFAULTCONTENT(){
		getcurrentDriver().switchTo().defaultContent();
	}
	public void implicitwait(int arg){
		getcurrentDriver().manage().timeouts().implicitlyWait(arg, TimeUnit.SECONDS);
	}
	

}
