package com.vilas.java8_tutorial.ch02.functionalprogram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FunctionalPrograming05File {

	public static void main(String[] args) throws IOException {

		Files.lines(Paths.get("File.txt"))//This file can be seen in the root folder parallel to src.
		 .map(str -> str.split(" "))
		 .flatMap(Arrays::stream)
		 .distinct()
		 .sorted()
		 .forEach(System.out::println);

		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);

	}
}
