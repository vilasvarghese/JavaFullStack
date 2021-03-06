package com.vilas.java8_tutorial.ch02.functionalprogram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 ************************************************************************************ 
 *		
 * 		Preferably do lambda and streams before you get here.
 * 		Thanks to 28 min. tutorial
 ************************************************************************************* 
 * Print all the even numbers in a list
 */

public class FunctionalPrograming01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		printAllNumbersInListStructured(numbers);
		System.out.println("Even Numbers");
		printEvenNumbersInListStructured(numbers);
		System.out.println("All numbers using stream");		
		printAllNumbersInListFunctional(numbers);
		System.out.println("Even Numbers using stream");
		printEvenNumbersInListFunctional(numbers);
		System.out.println("Square numbers using stream");
		printSquaresOfEvenNumbersInListFunctional(numbers);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		Iterator<Integer> i = numbers.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		
		// How to loop the numbers? - Enhanced for loop
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
	
	private static boolean isEven(int number) {
		return number%2 == 0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream().forEach(s->System.out.println(s));
		numbers.stream().forEach(System.out::println);// Method Reference
	}

	// number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do?

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference

		// .filter(FunctionaPrograming01::isEven)//Filter - Only Allow Even Numbers
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				//mapping - x -> x * x
				.map(number -> number * number)
				.forEach(System.out::println);// Method Reference

		// .filter(FunctionaPrograming01::isEven)//Filter - Only Allow Even Numbers
	}

}
