package com.vilas.java8_tutorial.ch03.lambda;

/**
 *
 * Example of compiler unable to detect lambda expression types
 */
public class Example2_Lambda {

    public static void main(String[] args) {
    	//lambda must either be a statement expression or a void compatible block

        //Comparator comparator = (first, second) -> first.length() - second.length();

        BiConsumer<String,String> bi = (String s1, String s2) -> new String("hi"); //OK. It's a statement expression
        //BiConsumer<String,String> bi1 = (String s1, String s2) -> "hi"; // Error. Not a statement expression.
    }
}
@FunctionalInterface
interface BiConsumer<A, B> {
    void accept(A a, B b);
}

/*

Reference : https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.27.2-230

It is a compile-time error if a block lambda body is neither void-compatible nor value-compatible.
Lambda must either be a statement expression or a void compatible block

A block lambda body is 
	1. void-compatible 
		if every return statement in the block has the form return;

	2. value-compatible 
		if it cannot complete normally and every return statement in the block has the form return Expression;.

e.g. 
The following lambda bodies are void-compatible:
	() -> {}
	() -> { System.out.println("done"); }

These are value-compatible:
	() -> { return "done"; }
	() -> { if (...) return 1; else return 0; }

This is neither:

() -> { if (...) return "done"; System.out.println("done"); }
*
*/