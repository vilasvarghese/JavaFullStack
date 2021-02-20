package java8;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i =0; i< 5000; i++) {
			list.add(i);
		}
		//automatically multiple threads would be created to execute this.
		list.parallelStream().forEach(System.out::println);
	}
}	