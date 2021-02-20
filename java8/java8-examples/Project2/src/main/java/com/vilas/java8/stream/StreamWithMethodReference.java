package java8;

import java.util.Arrays;
import java.util.List;

public class StreamWithMethodReference {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "bb", "ccc");
		//internal iteration can happen as follows
		list.forEach(s -> printMsg(s));
		
		//this can be modified with a static reference to method as below
		list.forEach(StreamWithMethodReference::printMsg);
		list.forEach(System.out::println);
	}
	
	public static void printMsg(String s) {
		System.out.println(s);
	}
}
