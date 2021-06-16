package com.vilas.java8_tutorial.ch12.annotation;


@interface VilasAnnotation
{
	int age();
	String name();
}

@interface AnotherAnnotation{
	int version() default 10;
}

@VilasAnnotation(age = 43, name = "Vilas Varghese")
@AnotherAnnotation
//@VilasAnnotation(age=53, name ="New Person")
public class Example01_TraditionalAnnotation {
}
