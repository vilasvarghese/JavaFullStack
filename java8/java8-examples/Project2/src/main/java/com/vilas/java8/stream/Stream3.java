package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream3 {
	//add only those numbers which are divisible by 5
	public static void main(String[] args) {
		List<Integer> aList = Arrays.asList(12, 25, 3, 4, 5, 6, 7);
		oldMethod(aList);
		Stream<Integer> s = aList.stream();
		Stream<Integer> s1 = s.filter(i -> i%5 ==0);
		Stream<Integer> s2 = s1.map(t -> t*t);
		int x = s2.reduce(0, Integer::sum);
		System.out.println(aList.stream().filter(i ->i%5 == 0).map(t -> t*t).reduce(0, Integer::sum));
	}
	
	public static void oldMethod(List<Integer> aList) {
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t %5 == 0;
			}
		};
		
		System.out.println(aList.stream().filter(p).reduce(0, Integer::sum));
	}
}