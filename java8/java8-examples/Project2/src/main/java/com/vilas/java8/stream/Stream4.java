package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {

	public static void main(String[] args) {
		List<String> students = Arrays.asList("Priyanka", "Daya", "George", "Mary", "Sarah", "Elishbah", "Augen");
		//System.out.println(aStudents.stream().filter(s -> s.contains("a")).map(s -> s.toUpperCase()).reduce(0,String::concat)));
		students.stream().filter(s -> s.contains("a")).map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	}
}