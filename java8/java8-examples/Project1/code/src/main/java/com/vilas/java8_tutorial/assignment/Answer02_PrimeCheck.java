package com.vilas.java8_tutorial.assignment;

/*
PerformOperation isPrime(): 
	The lambda expression must return 
		true if a number is prime or  
		false if it is composite.
*/		
public class Answer02_PrimeCheck {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(checkPrime().isPrime(4));
		System.out.println(checkPrime().isPrime(5));
	}
	
    public static PerformOperation1 checkPrime() {
    	 return (int n) ->java.math.BigInteger.valueOf(n).isProbablePrime(n);
    }
}

interface PerformOperation1{
	boolean isPrime(int n);
}