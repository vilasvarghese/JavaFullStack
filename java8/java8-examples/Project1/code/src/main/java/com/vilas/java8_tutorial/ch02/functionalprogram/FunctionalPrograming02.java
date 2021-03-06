package com.vilas.java8_tutorial.ch02.functionalprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Print sum of integers in a list
 * Print distinct numbers in a list
 * Print square of all numbers in a list
 * Print only the even numbers in a list
 * Print the courses sorted by the lenght of the course name.
 */
public class FunctionalPrograming02 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListStructured(numbers);
		System.out.println(sum);

		//Solution using lambda's
		System.out.println("Sorted distinct numbers");
		numbers.stream()
			.distinct() //Stream<T> Intermediate
			.sorted() //Stream<T>
			.map(s -> s +", ")
			.forEach(System.out::print); //void
		System.out.println();
		
		System.out.println("Square of numbers");
		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) //Stream<R>
				.collect(Collectors.toList()); //R
		printList(squaredNumbers);
		

		System.out.println("Even Numbers");
		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) //Stream<T>
				.collect(Collectors.toList());
		printList(evenNumbersOnly);
		
		System.out.println("assigning a method to a variable");
		sum = numbers.stream().reduce(0, (x,y) -> x*x + y*y); //T
		System.out.println("sum "+sum);
		
		
		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
		System.out.println("Gretest "+greatest);
		
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList());
		System.out.println("Courses Sorted By Length Of Course Title "+coursesSortedByLengthOfCourseTitle);
	}

	private static int addListStructured(List<Integer> numbers) {
		//how to loop?
		//how to store the sum?
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
	
	private static void printList(List<Integer> list) {
		list.stream().forEach(System.out::print);
		System.out.println();
	}
}
