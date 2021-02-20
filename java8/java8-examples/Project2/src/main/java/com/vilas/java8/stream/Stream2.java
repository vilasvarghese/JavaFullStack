package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
		//Calculate the sum of square of all the numbers.
		List<Integer> aList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		//aList.forEach(System.out::println);
		step1(aList);
		step2(aList);
		step3(aList);
		step4(aList);
		step5(aList);
	}
	
	public static void step1(List aList) {
		//Function accepts one argument and returns a result of type R
		//for e.g. sum of the square of all numbers
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			@Override
			
			//This method can be used to processing on each input
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		
		Stream<Integer> stream = aList.stream().map(function); 
		
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
			@Override
			//This method can be used for operating on two values
			//first being the carry and second element
			public Integer apply(Integer c, Integer e) {
				return c + e;
			}
		};
	
		Integer sqSum = stream.reduce(0,bo);
		System.out.println(sqSum);
	}

	public static void step2(List aList) {
		//Function accepts one argument and returns a result of type R
		//for e.g. we want to multiply all values in list with 2
		Stream<Integer> stream = aList.stream().map(new Function<Integer, Integer>() {
			@Override
			//This method can be used to processing on each input
			public Integer apply(Integer t) {
				return t*t;
			}
		}); 
		Integer sqSum = stream.reduce(0,new BinaryOperator<Integer>() {
			@Override
			//This method can be used for operating on two parameters.
			//First is the carry and second is the element.
			public Integer apply(Integer c, Integer e) {
				return Integer.sum(c, e);
			}
		});
		System.out.println(sqSum);

	}

	public static void step3(List aList) {
		//Function accepts one argument and returns a result of type R
		//for e.g. we want to multiply all values in list with 2
		
		Stream<Integer> stream = aList.stream();
		stream = stream.map((t) -> (t*t)); 
		Integer sqSum = stream.reduce(0,(c, e) -> c + e);
		System.out.println(sqSum);
	}
	
	public static void step4(List<Integer> aList) {
		//c - carry and e - element
		System.out.println(aList.stream().map(t->t*t).reduce(0, (c,e)-> c+e));
	}
	
	public static void step5(List<Integer> aList) {
		//c - carry and e - element
		
		System.out.println(aList.stream().map(t->t*t).reduce(0, (c,e)-> Integer.sum(c,e)));
		System.out.println(aList.stream().map(t->t*t).reduce(0, Integer::sum));
	}

}
