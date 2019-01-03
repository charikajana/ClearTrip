package com.niit.cleartrip.cleartripobjectcreation;

import com.niit.cleartrip.commonfunctions.Registration;
import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class ClearTrip {
	public WebDriverInitialization webdriverintialization;
	public Registration registration;
	
	public ClearTrip(){
		webdriverintialization=new WebDriverInitialization();
		registration=new Registration(webdriverintialization);
	}
	

}
