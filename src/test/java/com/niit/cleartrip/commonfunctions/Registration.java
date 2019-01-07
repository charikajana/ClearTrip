package com.niit.cleartrip.commonfunctions;


import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class Registration {

WebDriverInitialization webdriverinteraction;//corrected the spelling by Venu on 1/5/19

	public Registration(WebDriverInitialization webdriverinteraction){
	this.webdriverinteraction=webdriverinteraction;
}

	public void successful_registration(){
		webdriverinteraction.click("com.cleartrip.flights.userAccount");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register");
		webdriverinteraction.implicitwait(10);
		webdriverinteraction.SWITCHTOFRAME_BYUSING_NAME("modal_window");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.email","com.cleartrip.flights.userAccount.emailValue");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register.submit");
		webdriverinteraction.implicitwait(10);
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.password","com.cleartrip.flights.userAccount.register.passwordValue");
		webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.userAccount.register.title","com.cleartrip.flights.userAccount.register.titleValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.firstname","com.cleartrip.flights.userAccount.register.firstnameValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.lastname","com.cleartrip.flights.userAccount.register.lastnameValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.mobilenumber","com.cleartrip.flights.userAccount.register.mobilenumberValue");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register.signUp");
		
	}
	public void failureRegistrations(){
		webdriverinteraction.click("com.cleartrip.flights.userAccount");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register");
		webdriverinteraction.implicitwait(10);
		webdriverinteraction.SWITCHTOFRAME_BYUSING_NAME("modal_window");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.email","com.cleartrip.flights.userAccount.emailValue");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register.submit");
		webdriverinteraction.implicitwait(10);
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.password","com.cleartrip.flights.userAccount.register.passwordValue");
		webdriverinteraction.SELECTBYVALUE("com.cleartrip.flights.userAccount.register.title","com.cleartrip.flights.userAccount.register.titleValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.firstname","com.cleartrip.flights.userAccount.register.firstnameValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.lastname","com.cleartrip.flights.userAccount.register.lastnameValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.register.mobilenumber","com.cleartrip.flights.userAccount.register.mobilenumberValue");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.register.signUp");
	}

	public void newMethod(){//comment added
		System.out.println("new method added");
	}
}
