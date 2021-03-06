package com.vilas.java8_tutorial.ch02.functionalprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalPrograming03FunctionalInterface {

	 boolean isEven(int x) {
	 	return x%2==0;
	 }
	 
	 int squared(int x) {
	 	return x * x;
	 }
	  

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};

		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		numbers.stream().filter(isEvenPredicate2).map(squareFunction2).forEach(sysoutConsumer2);
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		
		//BinaryOperator<Integer> sumBinaryOperator = {(x,y) => x + y};
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a + b;
			}
			
		};
		
		
		int sum = numbers.stream().reduce(0, sumBinaryOperator);
		
		
		numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
		isEvenPredicate = (Integer x) -> x % 2 == 0;
		squareFunction = x -> x * x;
		Function<Integer, String> stringOutpuFunction = x -> x + " ";
		Consumer<Integer> sysoutConsumer3 = x -> System.out.println(x);

		sumBinaryOperator = (x, y) -> x + y;
		
		//No input > Return Something
		Supplier<Integer> randomIntegerSupplier = () -> {
			return new Random().nextInt(1000);
		};
		
		//System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number,str) -> {
			return number<10 && str.length()>5;
		};
		
		System.out.println(biPredicate.test(10, "Vilas"));
		
		BiFunction<Integer, String, String> biFunction = (number,str) -> {
			return number + " " + str;
		};
		
		System.out.println(biFunction.apply(15, "Vilas"));
		
		Consumer<Integer> biConsumer = (s1) -> {
			System.out.println(s1);
		};
		
		biConsumer.accept(25);
		
		sumBinaryOperator2 = (x, y) -> x + y;
		
		IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
		
		//IntBinaryOperator
		//IntConsumer
		//IntFunction
		//IntPredicate
		//IntSupplier
		//IntToDoubleFunction
		//IntToLongFunction
		//IntUnaryOperator
		
		//Long, Double, Int
		

		//numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);

		//int sum = numbers.stream().reduce(0, sumBinaryOperator);
	}
}
