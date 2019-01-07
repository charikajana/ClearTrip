package com.niit.cleartrip.test.flight;

import java.io.IOException;

import com.niit.cleartrip.cleartripobjectcreation.ClearTrip;

public class CommonTest {
	static ClearTrip cleartrip;
	public static void main(String[] args) throws IOException {
		cleartrip=new ClearTrip();
		cleartrip.registration.successful_registration();
		//cleartrip.SignIn.signIn();
		cleartrip.onewayflighttrip.oneWay();
		cleartrip.roundtripflighttrip.roundTrip();
	}

}
