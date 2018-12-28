package com.niit.cleartrip.webdriverutil;

import java.io.IOException;
import org.openqa.selenium.By;

import com.niit.cleartrip.fileoperations.LoadProperties;


public class ByClass {
	static By by;
	public static By getByValue(String arg) throws IOException{
		arg=LoadProperties.getDerivedProperty(arg);
		String arg1=arg.split(";")[0];
		String arg2=arg.split(";")[1];
		switch(arg1.toUpperCase()){
		case"ID":
			by =By.id(arg2);
			break;
		case"NAME":
			by =By.name(arg2);
			break;
		case"XPATH":
			by=By.xpath(arg2);
			break;
		case"CSSSELECTOR":
			by=By.cssSelector(arg2);
			break;
			
		}
		return by;
	}

}
