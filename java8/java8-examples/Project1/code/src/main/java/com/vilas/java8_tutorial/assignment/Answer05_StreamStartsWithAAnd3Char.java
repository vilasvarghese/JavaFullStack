package com.vilas.java8_tutorial.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Answer05_StreamStartsWithAAnd3Char {

	public static void main(String[] args) {
		List<String> empList = Arrays.asList("Ani", "Ann", "Bil", "Bot", "Aly");
		get3CharLongStringStartingA(empList).forEach(System.out::println);
		
	}
	
	public static List<String> get3CharLongStringStartingA(List<String> list){
		return list.stream()
				  .filter(s -> s.startsWith("A"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
	}
}
