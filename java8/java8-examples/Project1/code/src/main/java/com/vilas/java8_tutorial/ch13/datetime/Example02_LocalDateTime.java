package com.vilas.java8_tutorial.ch13.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example02_LocalDateTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 1, 13);
		LocalDateTime datetime = date.atTime(1, 50, 9);
		System.out.println(datetime);
	}
}
