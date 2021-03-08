package com.vilas.java8_tutorial.ch04.stream;

import java.util.Arrays;
import java.util.List;

public class Example3_MapStreams {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		num
			.stream()
			.map(n -> n * n)// returns one value for each element
			.forEach(System.out::println);
	}
}
