package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		
		List<String> teachersList = Arrays.asList("Suchindra", "Vilas", "Nevin");
		teachersList.stream().forEach(System.out::println);
	}
}
