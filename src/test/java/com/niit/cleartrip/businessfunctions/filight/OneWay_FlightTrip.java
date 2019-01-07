package com.niit.cleartrip.businessfunctions.filight;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class OneWay_FlightTrip {//Code updated by Venu on 1/6
	
	public WebDriver driver;
	
	WebDriverInitialization webdriverinteraction;
	
	public OneWay_FlightTrip(WebDriverInitialization webdriverinteraction){
		
		this.webdriverinteraction = webdriverinteraction;
		}
	

	
public void oneWay() throws IOException{
		
		webdriverinteraction.implicitwait(5);
		
		webdriverinteraction.FINDELEMENT("com.cleartrip.flights.oneWayRadio").click();
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.oneWay.From","com.cleartrip.flights.oneWay.FromValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.oneWay.To","com.cleartrip.flights.oneWay.ToValue");
		webdriverinteraction.click("com.cleartrip.flights.oneWay.DepartOn");
		webdriverinteraction.click("com.cleartrip.flights.oneWay.DepartOnValue");
		//WebElement wea= wdInitialization.FINDELEMENT("com.cleartrip.flights.oneWay.Adults");
		//Select Adults = new Select(wea);
		webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.oneWay.Adults","com.cleartrip.flights.oneWay.AdultsValue");
		//Adults.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.oneWay.AdultsValue"));
		//WebElement wec= wdInitialization.FINDELEMENT("com.cleartrip.flights.oneWay.Children");
		webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.oneWay.Children", "com.cleartrip.flights.oneWay.ChildrenValue");
		//Select Child = new Select(wec);
		//Child.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.oneWay.ChildrenValue"));
		webdriverinteraction.click("com.cleartrip.flights.oneWay.MoreOptions");
		webdriverinteraction.click("com.cleartrip.flights.oneWay.SearchFlights");
		
	}
	

}
