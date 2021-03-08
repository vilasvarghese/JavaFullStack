package com.vilas.java8_tutorial.ch04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2_FilterStream {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Vilas", "Sana", "Elishbah", "Sarah", "Hannah");

		names.stream().filter(str -> str.length() > 4).forEach(str -> System.out.print(str + ", "));
	}
}
