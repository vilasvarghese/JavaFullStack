package com.vilas.fullstackjava;

public class WordCount {
	public int wcount(String str) {
		String[] words = str.split(" ");
		return words.length;
	}
}
