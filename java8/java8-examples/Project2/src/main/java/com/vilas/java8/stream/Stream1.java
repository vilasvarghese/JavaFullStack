package java8;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		//This is a lambda expression. Generics allows it to do the same.
		//forEach takes Consumer a functional interface 
		//as it's parameter. This functional interface has a 
		//single method which is accept(T).
		
		//aList.forEach(i -> System.out.println(i));
		
		Consumer<Integer> c = new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		
		//aList.forEach(c);
		//is same as below
		Consumer<Integer> c1 = i -> System.out.println(i);
		//is same as
		//aList.forEach(i -> System.out.println(i));
		//aList.forEach(System.out::println);
		
		//stream
		aList.forEach(System.out::println);
		
		aList.parallelStream().forEach(System.out::println);
		
		//System.out.println();
		//System.out.println(aList.stream());

	}
}
