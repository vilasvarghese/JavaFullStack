package com.vilas.java8_tutorial.internationalization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;

public class Example01_Locale {

	public static void main(String args[]) {
		Locale locale=Locale.getDefault();  
		printLocale(locale);
		
		Locale locale1=new Locale("fr","fr");//{"en", "US"}
		printLocale(locale1);  
		
		Locale locale2 = new Locale.Builder()
				  .setLanguage("fr")//Locale.FRANCE
				  .setRegion("CA")
				  .setVariant("POSIX")
				  .setScript("Latn")
				  .build();
		printLocale(locale2);
		
		Locale[] locales = Locale.getAvailableLocales();
		Locale.setDefault(Locale.CANADA);
		LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 10, 15, 50, 500);
	}
	
	public static void printLocale(Locale locale1) {
		System.out.println(locale1.getDisplayCountry());  
		System.out.println(locale1.getDisplayLanguage());  
		System.out.println(locale1.getDisplayName());  
		System.out.println(locale1.getISO3Country());  
		System.out.println(locale1.getISO3Language());  
		System.out.println(locale1.getLanguage());  
		System.out.println(locale1.getCountry()); 
		
	}
}
