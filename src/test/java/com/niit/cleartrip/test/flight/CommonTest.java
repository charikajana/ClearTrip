package com.niit.cleartrip.test.flight;

import com.niit.cleartrip.cleartripobjectcreation.ClearTrip;

public class CommonTest {
	static ClearTrip cleartrip;
	public static void main(String[] args) {
		cleartrip=new ClearTrip();
		cleartrip.registration.successful_registration();
	}

}
