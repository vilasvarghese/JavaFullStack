package com.vilas.java8_tutorial.ch13.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class Example03_LocalTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
	    LocalTime time1 = LocalTime.of(10,43,12, 34982304);  
	    System.out.println(time1);  
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3);
	    
	    LocalTime time4=time1.plusHours(4);  
	    LocalTime time5=time2.plusMinutes(18);  
	    System.out.println(time4);
	    System.out.println(time5);  
	    
	    LocalTime time6 = LocalTime.now(ZoneId.of("GMT"));
	    LocalTime time7 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
	    
	    System.out.println(time6);
	    System.out.println(time7);
	    for (String s: ZoneId.getAvailableZoneIds()) {
	    	System.out.println(s);
	    }
	}
}
