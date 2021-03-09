package com.vilas.java8_tutorial.ch04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * Reduce 
**********	Terminal operation 
**********	Allow us to produce one single result from a sequence of elements
***********	So it can apply a lambda on a a sequence of elements and reduce it 
***********		to a single value based on the logic defined in lambda
*
* reduce has 3 parameters
***********	Identity – defines initial value of the reduction operation 
********************** default result if the stream is empty
***********	Accumulator – 
***********		Function that takes two parameters: 
***********		a) partial result of the reduction operation 
***********		b) the next element of the stream
***********	Combiner – 
***********		Function (lambda) used to combine the partial result of the reduction operation 
*
 */

public class Example5_ReduceValue {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers
		  .stream()
		  .reduce(0, Math::subtractExact);
		
		//Identity: 0
		//Accumulator: (subtotal, element) - function that takes 2 parameters
		//Combiner: definition of the logic of how to combine.
		
		System.out.println(result);
		
		int result1 = numbers.stream().reduce(0, Integer::sum);
		System.out.println(result1);
		
		//Other possible operators could be 
		//substraction, multiplication, division of integers.
		//concatenation of string etc..
	}
}