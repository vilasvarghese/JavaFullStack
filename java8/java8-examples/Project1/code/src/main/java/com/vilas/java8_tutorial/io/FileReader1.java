package com.vilas.java8_tutorial.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileReader1 {

	public static void main(String[] args)  {
		
		Path path = Paths.get("D:\\code1\\myjava8\\src\\main\\java\\com\\vilas\\java8_tutorial\\io\\data.txt");
		
		try(Stream<String> lines = Files.lines(path)) {
			Optional<String> optional = lines.filter(s->s.contains("line15")).findFirst();
		if(optional.isPresent()){
			System.out.println(optional.get());
		}else
			System.out.println("No data found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
