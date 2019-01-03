package com.niit.cleartrip.cleartripobjectcreation;


import com.niit.cleartrip.commonfunctions.Registration;
import com.niit.cleartrip.webdriverutil.WebDriverInitialization;
//Comment added by Venu

public class ClearTrip {
	public WebDriverInitialization webdriverintialization;
	public Registration registration;
	
	public ClearTrip(){
		webdriverintialization=new WebDriverInitialization();
		registration=new Registration(webdriverintialization);
	}
	

}
