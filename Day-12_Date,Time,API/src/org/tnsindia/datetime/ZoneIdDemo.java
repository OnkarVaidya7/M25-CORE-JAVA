package org.tnsindia.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t=LocalTime.now(ZoneId.of("US/Alaska"));
		System.out.println(t);
		for(String  s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
