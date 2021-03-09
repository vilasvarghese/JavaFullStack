package com.vilas.java8_tutorial.ch13.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/*

A Temporal defines a representation of a date, time, or a combination of both, depending on the implementation we're going to be using.

There are a number of implementations of the Temporal interface, including:

LocalDate – which represents a date without a timezone
LocalDateTime – which represents a date and time without a timezone
HijrahDate – which represents a date in the Hijrah calendar system
MinguoDate – which represents a date in the Minguo calendar system
ThaiBuddhistDate – which represents a date in the Thai Buddhist calendar system


TemporalAdjuster
Functional interface which has many predefined implementations in the TemporalAdjusters class. The interface has a single abstract method named adjustInto() which can be called in any of its implementations by passing a Temporal object to it.

TemporalAdjuster allows us to perform complex date manipulations. 
For example, we can obtain the date of the next Sunday, the last day of the current month or the first day of the next year. We can, of course, do this using the old java.util.Calendar.
However, the new API abstracts away the underlying logic using its predefined implementations. 

Refer below for more details
https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjuster.html

 */
public class Example08_TemporaralAdjuster {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2017, 07, 8);
		LocalDate nextSunday = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(nextSunday);

		LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastDayOfMonth);

		TemporalAdjuster temporalAdjuster = t -> t.plus(Period.ofDays(14));
		LocalDate result = localDate.with(temporalAdjuster);
		System.out.println(result);

	}
}
