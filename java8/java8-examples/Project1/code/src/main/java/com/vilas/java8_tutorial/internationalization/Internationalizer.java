package com.vilas.java8_tutorial.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Internationalizer {
	public static void main(String args[]) {
		printMessage(new Locale("en", "US"), "greetings");
		printMessage(new Locale("en", "IN"), "greetings");
	}

	public static void printMessage(Locale locale, String key) {
		//ResourceBundle myBund = ResourceBundle.getBundle("D:/code1/myjava8/src/main/java/com/vilas/java8_tutorial/internationalization/Bundle.properties", locale);
	
		ResourceBundle myBund = ResourceBundle.getBundle("main/java/com/vilas/java8_tutorial/internationalization/Bundle", locale);
		System.out.println(myBund.getString(key));
	}
}