package com.vilas.java8_tutorial.ch03.lambda;

import java.util.function.IntConsumer;

public class Example5_EffectivelyFinal {

	public static void main(String[] args) {
		int i = 15;	
		//i++;
		
		IntConsumer consumer = x -> System.out.println(x + i);
		consumer.accept(25);
	}
}
