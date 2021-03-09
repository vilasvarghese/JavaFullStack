package com.vilas.java8_tutorial.assignment;

import java.util.function.Predicate;

/*
1. PerformOperation isOdd(): 
	The lambda expression must return 
		true if a number is odd or  
		false if it is even.
*/
public class Answer01_OddOrEvent {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(checkEvenOdd().isOdd(4));
		System.out.println(checkEvenOdd().isOdd(5));
	}

	 public static PerformOperation checkEvenOdd() {
		 return (int n) ->(n % 2 != 0);
	 }
}

interface PerformOperation{
	boolean isOdd(int n);
}