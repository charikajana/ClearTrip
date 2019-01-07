package com.niit.cleartrip.cleartripobjectcreation;

import com.niit.cleartrip.businessfunctions.filight.OneWay_FlightTrip;
import com.niit.cleartrip.businessfunctions.filight.RoundTrip_FlightTrip;
import com.niit.cleartrip.commonfunctions.Registration;
import com.niit.cleartrip.commonfunctions.SignIn;
import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class ClearTrip {//Code added by Venu 1/6
	public WebDriverInitialization webdriverintialization;
	public Registration registration;
	public OneWay_FlightTrip onewayflighttrip;
	public SignIn signin;
	public RoundTrip_FlightTrip roundtripflighttrip;
	
	public ClearTrip(){
		webdriverintialization=new WebDriverInitialization();
		registration=new Registration(webdriverintialization);
		signin = new SignIn(webdriverintialization);
		onewayflighttrip = new OneWay_FlightTrip(webdriverintialization);
		roundtripflighttrip = new RoundTrip_FlightTrip(webdriverintialization);
		
		
	}
	

}
