package com.vilas.java8_tutorial.ch04.stream;

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

/*
* Refer notes: java8_tutorial\ch02\functionalprogram\Notes.txt
*/
public class JavaStreams {
	public static void main(String[] args) throws IOException {

		// 1. Integer Stream. No intermediate method.
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		// 2. Integer Stream with skip. skip is the intermediate method.
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
		System.out.println();

		// 3. Integer Stream with sum. Sum is a reducing terminal operation
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		// 4. Stream.of, sorted and findFirst. findFirst is intermediate and can't be
		// terminal.
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

		// 5. Stream from Array, filter, sort and print
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Vilas", "Sarah" };
		Arrays.stream(names) // same as Stream.of(names)
				.filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

		// 6. average of squares of an int array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);

		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Vilas", "Sarah");
		people.stream().map(String::toLowerCase)// map transforms.
				.filter(x -> x.startsWith("a"))// filter reduces
				.forEach(System.out::println);// foEach terminates

		// 8. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();

		// 9. Stream rows from text file and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).filter(x -> x.contains("jit"))
				.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));

		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1.map(x -> x.split(",")).filter(x -> x.length == 3).count();
		System.out.println(rowCount + " rows.");
		rows1.close();

		// 11. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
		rows2.close();

		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));// In the root folder
		Map<String, Integer> map = new HashMap<>();
		map = rows3.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows3.close();
		/*
		 * Questions? When should we close a stream.
		 * 
		 * Answer: Generally we don't need to close a stream. But some streams have
		 * references to files. This file remains open until we close them.
		 */

		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}

		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);

		// 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);
	}
}