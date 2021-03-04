package com.vilas.java8_tutorial.ch02.functionalprogram;

import java.util.Arrays;
import java.util.List;

/*
 * Print all the even numbers in a list
 */

public class FunctionaPrograming01 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
		
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
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
	
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream().forEach(System.out::println);// Method Reference
	}

	// number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do?

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				//mapping - x -> x * x
				.map(number -> number * number)
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}

}
