package com.niit.cleartrip.commonfunctions;

import org.openqa.selenium.WebDriver;

import com.niit.cleartrip.browserfactory.BrowserFactory;

public class LaunchWebSite {
	static WebDriver driver;
	public static WebDriver navigatingTO_URL(){//method name updated by Venu
		if(driver==null){
			driver=BrowserFactory.getdesiredbrowser();
		}
		return driver;
	}	

}
