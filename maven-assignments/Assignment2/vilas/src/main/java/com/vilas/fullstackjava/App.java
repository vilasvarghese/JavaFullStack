package com.vilas.fullstackjava;

import org.apache.commons.lang3.StringUtils;

public class App 
{
	public static void main( String[] args ) {
		deleteWhitespace("Hai vilas welcome to maven assignments");
	}

	public static void deleteWhitespace(String s) {
		if (StringUtils.isNotEmpty(s)) {
			System.out.println(StringUtils.deleteWhitespace(s));
		}
	}
}
