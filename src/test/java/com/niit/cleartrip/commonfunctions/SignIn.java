package com.niit.cleartrip.commonfunctions;

import java.io.IOException;

import com.niit.cleartrip.webdriverutil.WebDriverInitialization;

public class SignIn {//Added by Venu on 1/6 
	
	WebDriverInitialization webdriverinteraction;
	
	public SignIn(WebDriverInitialization webdriverinteraction){
		
		this.webdriverinteraction = webdriverinteraction;
		
	}
	
	public void signIn() throws IOException{
				
		webdriverinteraction.click("com.cleartrip.flights.userAccount");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.signIn");
		webdriverinteraction.implicitwait(3);
		webdriverinteraction.SWITCHTOFRAME_BYUSING_NAME("modal_window");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.signIn.email","com.cleartrip.flights.userAccount.signIn.emailValue");
		webdriverinteraction.SENDKEYS("com.cleartrip.flights.userAccount.signIn.password","com.cleartrip.flights.userAccount.signIn.passwordValue");
		webdriverinteraction.click("com.cleartrip.flights.userAccount.signInButton");
		
				
			}
	

}
