package com.vilas.java8_tutorial.ch04.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {


	public static void main(String[] args) {
		//flatpMap();
		int[] inputArray = {1,2,3,4,5};
		
		int[] outputArray = duplicate(inputArray);
		
		System.out.println("twice");
		Arrays.stream(outputArray).forEach(System.out::println);
		/*
		System.out.println("thrice");		
		outputArray = duplicate(inputArray, 3);
		Arrays.stream(outputArray).forEach(System.out::println);*/
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
	
	public static void flatpMap() {
		List<List<String>> list = Arrays.asList(
				  Arrays.asList("a", "b", "c"),
				  Arrays.asList("x","y","z")
				 );
		
		list.stream().map(Collection::stream).forEach(System.out::println);
		list.stream().flatMap(Collection::stream).forEach(System.out::println);
		/*
		System.out.println(list
				  .stream()
				  .flatMap(Collection::stream)
				  .collect(Collectors.toList()));
		System.out.println(list
				  .stream()
				  .map(Collection::stream)
				  .collect(Collectors.toList()));*/
	}
}
