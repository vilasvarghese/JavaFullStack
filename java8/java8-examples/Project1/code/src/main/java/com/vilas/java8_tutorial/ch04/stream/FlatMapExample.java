package com.vilas.java8_tutorial.ch04.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {


	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5};
		int[] outputArray = duplicate(inputArray);
		
		System.out.println("twice");
		Arrays.stream(outputArray).forEach(System.out::println);
		
		System.out.println("thrice");		
		outputArray = duplicate(inputArray, 3);
		Arrays.stream(outputArray).forEach(System.out::println);
		
		System.out.println("thrice String");		
		String[] strArray = {"Vilas", "Sana", "Elishbah", "Sarah", "Hannah"};
		//List<String> strOutputArray = duplicate (strArray, 2);
		//strOutputArray.stream().forEach(System.out::println);

	}
	
	

	public static int[] duplicate(int[] a){
		return Arrays.stream(a)
        .flatMap(e -> IntStream.generate(() -> e).limit(2))
        .toArray();
	}
	
	public static int[] duplicate(int[] a, int count){
		return Arrays.stream(a)
        .flatMap(e -> IntStream.generate(() -> e).limit(count))
        .toArray();
	}
	
	/*
	 *
	 * Following is getting stuck as we iterate into the elements.
	public static List<String> duplicate(String[] a, int count){
		System.out.println("start");
		Stream<String> stream  = Arrays.stream(a);
		//print(stream);
		Stream<String> stream1 = stream.flatMap(e -> Stream.generate(() -> e)).limit(count);
		print(stream1);
		List<String> c = stream1.collect(Collectors.toList());
		return c;
	}

	private static void print(Stream<String> mystream ) {
		List<String> c = mystream.collect(Collectors.toList());
		for (String s : c)
		{
			System.out.println(s);
		}
	}
	*/
}
