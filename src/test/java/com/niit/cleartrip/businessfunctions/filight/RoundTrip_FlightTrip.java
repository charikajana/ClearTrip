package com.niit.cleartrip.businessfunctions.filight;

import java.io.IOException;

import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class RoundTrip_FlightTrip {//Code updated by Venu 1/6

	WebDriverInitialization webdriverinteraction;
	
	public RoundTrip_FlightTrip(WebDriverInitialization webdriverinteraction){
		
		this.webdriverinteraction = webdriverinteraction;
	}


public void roundTrip() throws IOException{
	

	
	webdriverinteraction.implicitwait(10);
	
	webdriverinteraction.click("com.cleartrip.flights.roundTripRadio");
	webdriverinteraction.SENDKEYS("com.cleartrip.flights.roundTrip.From","com.cleartrip.flights.roundTrip.FromValue");
	webdriverinteraction.SENDKEYS("com.cleartrip.flights.roundTrip.To","com.cleartrip.flights.roundTrip.ToValue");
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.DepartOn");
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.DepartOnValue");
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.ReturnOn");
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.ReturnOnValue");
	webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.roundTrip.Adults", "com.cleartrip.flights.roundTrip.AdultsValue");
//	WebElement wea= driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.Adults"));
//	Select Adults = new Select(wea);
//	Adults.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.AdultsValue"));
	webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.roundTrip.Children", "com.cleartrip.flights.roundTrip.ChildrenValue");
	//	WebElement wec= driver.findElement(PropTest.getByValue("com.cleartrip.flights.roundTrip.Children"));
	//Select Child = new Select(wec);
	//Child.selectByValue(PropTest.getKeyValue("com.cleartrip.flights.roundTrip.ChildrenValue"));
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.MoreOptions");
	webdriverinteraction.click("com.cleartrip.flights.roundTrip.SearchFlights");
	
}
}
