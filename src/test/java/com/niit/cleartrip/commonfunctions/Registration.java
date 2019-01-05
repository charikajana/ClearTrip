package com.niit.cleartrip.commonfunctions;


import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class Registration {

WebDriverInitialization webdriverintraction;

	public Registration(WebDriverInitialization webdriverintraction){
	this.webdriverintraction=new WebDriverInitialization();
}

	public void successful_registration(){
		webdriverintraction.click("com.cleartrip.flights.userAccount");
		//line added by Venu
		webdriverintraction.click("com.cleartrip.flights.userAccount.register");
		webdriverintraction.implicitwait(10);
		webdriverintraction.SWITCHTOFRAME_BYUSING_NAME("modal_window");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.email","com.cleartrip.flights.userAccount.emailValue");
		webdriverintraction.click("com.cleartrip.flights.userAccount.register.submit");
		webdriverintraction.implicitwait(10);
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.password","com.cleartrip.flights.userAccount.register.passwordValue");
		webdriverintraction.SELECTBYVALUE("com.cleartrip.flights.userAccount.register.title","com.cleartrip.flights.userAccount.register.titleValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.firstname","com.cleartrip.flights.userAccount.register.firstnameValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.lastname","com.cleartrip.flights.userAccount.register.lastnameValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.mobilenumber","com.cleartrip.flights.userAccount.register.mobilenumberValue");
		webdriverintraction.click("com.cleartrip.flights.userAccount.register.signUp");
		
	}
	public void failureRegistrations(){
		webdriverintraction.click("com.cleartrip.flights.userAccount");
		webdriverintraction.click("com.cleartrip.flights.userAccount.register");
		webdriverintraction.implicitwait(10);
		webdriverintraction.SWITCHTOFRAME_BYUSING_NAME("modal_window");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.email","com.cleartrip.flights.userAccount.emailValue");
		webdriverintraction.click("com.cleartrip.flights.userAccount.register.submit");
		webdriverintraction.implicitwait(10);
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.password","com.cleartrip.flights.userAccount.register.passwordValue");
		webdriverintraction.SELECTBYVALUE("com.cleartrip.flights.userAccount.register.title","com.cleartrip.flights.userAccount.register.titleValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.firstname","com.cleartrip.flights.userAccount.register.firstnameValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.lastname","com.cleartrip.flights.userAccount.register.lastnameValue");
		webdriverintraction.SENDKEYS("com.cleartrip.flights.userAccount.register.mobilenumber","com.cleartrip.flights.userAccount.register.mobilenumberValue");
		webdriverintraction.click("com.cleartrip.flights.userAccount.register.signUp");
	}

	public void newMethod(){
		System.out.println("new method added");
	}
}
