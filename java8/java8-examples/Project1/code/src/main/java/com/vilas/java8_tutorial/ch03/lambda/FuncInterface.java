package com.vilas.java8_tutorial.ch03.lambda;

@FunctionalInterface
public interface FuncInterface {

	public void doSomething();
	//Valid because there is a default implementation
	default boolean myMethod(Object i) {return true;}
	//Valid because equals is implemented in Object class.
	public boolean equals(Object o);
}
