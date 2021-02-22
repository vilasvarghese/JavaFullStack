package main.java.com.vilas.java8_tutorial.methodreference;

import java.util.function.BiFunction;

public class InstanceVariableReference {


	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> summation1 = (p,q) -> Integer.sum(p, q);
		BiFunction<Integer, Integer, Integer> summation = Integer::sum;
				
		System.out.println(summation.apply(400, 500));
		
	}
}
