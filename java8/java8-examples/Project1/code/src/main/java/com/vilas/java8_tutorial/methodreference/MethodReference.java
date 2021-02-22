package main.java.com.vilas.java8_tutorial.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(8,12,55,23,98,12,666,2333);
		
		//Using lambda
		number.forEach(i->System.out.println(i));
		
		//Using method reference
		number.forEach(System.out::println);
		
		number.sort(Integer::compareTo);
		number.forEach(System.out::println);
		
	}
}