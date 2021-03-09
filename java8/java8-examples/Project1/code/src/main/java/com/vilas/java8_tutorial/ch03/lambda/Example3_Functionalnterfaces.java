package com.vilas.java8_tutorial.ch03.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

/*
 * 
 * 
 * 
 * java.util.function package provides a set of re-usable common functional
 * interfaces and their corresponding lambda we can use it directly instead
 * of creating brand new functional interfaces.
 * 
 * For example, when we need to check for a condition and return a boolean value
 * the function descriptor : (T)->boolean where T : parameter to the abstract
 * method/lambda boolean : return value of the method. Now, wherever we need to
 * use a lambda with the (T)->boolean descriptor, we can use the in-built
 * java.util.function.Predicate<T> functional interface because the descriptor
 * for Predicate<T>’s function is also (T)->boolean.
 * 
 * So we don't need to define a functional interface for public boolean
 * doSomething(<T>){ check condition }
 * 
 * The most used among them are covered below. 
 * If you understand the below, then you can extrapolate it to the rest.
 * The rest of the functional interfaces are built on top of these.
 *  
 * */

class Employee{
	public String name;
	public int sal;
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	
	public String toString() {
		return name +", "+sal;
	}
	
}

class MyConsumer{
	public <T> void printSomeRandomStuff(Supplier<T> s) {
		System.out.println(s.get());
	}
}

public class Example3_Functionalnterfaces {

	public static void main(String[] args) {
		
		MyConsumer m10 = new MyConsumer();
		m10.printSomeRandomStuff(() -> new Random().nextInt(1000));
		m10.printSomeRandomStuff(()-> new Random().nextFloat());
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Map<String, String> empMap = new HashMap<String, String>() {
			{
				put("43", "Vilas");
				put("44", "Prasad");
			}
		};
		
		/*
		 * 1. Consumer 
		 ****** 	Consumes a value but doesn't return anything 
		 *******	method: accept 
		 *******	Ideal for S.o.p, logging, 
		 * */

		Consumer<Integer> printer = message -> System.out.print(message);
		list.forEach(printer);
		
		Consumer<Employee> empConsumer = emp -> System.out.println(emp);
		empConsumer.accept(new Employee("Vilas", 600000));
		


		/* 2. BiConsumer 
		 ******* 	Can consume two values 
		 ******* 	Generally used for Maps 
		 *******	method: accept<T,T> accept<Integer, String> 
		*/
		BiConsumer<? super String, ? super String> bic = (k, v) -> System.out.print(k + "-> " + v + ", ");
		empMap.forEach(bic);


		/*
		 * 3. Supplier Can supply some value
		 ******* 	e.g. generate a randomn value within a bound
		 ********	method: get 	 	
		 */
		Supplier<Integer> s = () -> new Random().nextInt(1000);
		System.out.println(s.get());
		
		/*
		 * 4. Function
		 ******* 	Takes an input and returns an output
		 ******** 	Both a consumer and producer	
		 ********	method: apply(K,V) : apply (inputType, outputType)
		 ********	Applies the function/lambda on the input
		 */
		
		Function<String, Integer> func = s1 -> s1.length();//returns the length of the string
		System.out.println (func.apply("Vilas"));
		
		Function<Employee, Integer> empFunction = emp -> emp.name.length();
		
		/*
		 * 5. BiFunction
		 ******* 	Takes two input and returns an output
		 ******** 	Both a consumer of two parameters and produces output	
		 ********	method: apply(T,U, R) : apply (inputType1, inputType2, outputType)
		 ********	Applies the function/lambda on both the input
		 */
		
		BiFunction<String, String, Integer> bif = (t,u) -> t.length() +u.length();
		System.out.println(bif.apply("Vilas", "Varghese"));
		
		/*
		 * 6. Predicate
		 ******* 	Run a test on the input and returns a boolean
		 ******** 	Both a consumer and producer
		 ********	Used a lot in Collection streams
		 ********	method: apply(T,U, R) : test (inputType): output is always boolean
		 ********	Execute function/lambda and return boolean
		 */
		
		Predicate<String> predicate = s2 -> s2.length() > 5;
		System.out.println(predicate.test("Vilas varghese"));
		
		/*
		 * 7. BiPredicate
		 ******* 	Run a test on two parameter and returns a boolean
		 ******** 	Both a consumer and producer
		 ********	Used a lot in Map's streams
		 ********	method: apply(T,U, R) : test (inputType1, inputType2)
		 ********	Execute function/lambda and return boolean
		 */
		BiPredicate<String, Integer> bip = (s3,i) -> s3.length() == i;
		BiPredicate<String, Character> bip2 = (s31, c) -> s31.indexOf(c) > 0;
		System.out.println(bip.test("Vilas",5));
		
		/*
		 * 8. UnaryOperator
		 ******* 	apply an unary operation and return the result
		 ******** 	Both a consumer and producer
		 ********	Can be used in in Collection
		 ********	method: apply(T) : apply(inputType1): input and output types are same.
		 ********	Execute function/lambda and return result. 
		 */
		UnaryOperator<Integer> unary = n -> n+1;
		System.out.println(unary.apply(5));
		
		
		/*
		 * 9. BinaryOperator
		 ******* 	apply a binary operation and return the result
		 ******** 	Both a consumer and producer
		 ********	Can be used in Map
		 ********	method: apply(T) : apply(inputType): Input type should be same for 1 and 2.
		 ********	Execute function/lambda and return result. 
		 */
		
		//Input type should be same for first and second parameter.
		BinaryOperator<Integer> bo = (a,b) -> a+b;
		System.out.println(bo.apply(5, 6));
	}
}