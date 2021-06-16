package com.vilas.java8_tutorial.ch12.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;



/*
 * Annotations in general improves the ability of 
 *** 	compiler to identify and alert errors early
 ***	Runtime to identify and direct you better
 *** 	Code Reader to identify issues quickly etc.
 *
 * Type annotation improves all these capabilities
 * 
 * 
 * The ElementType.TYPE_PARAMETER target indicates that the annotation can be written 
 * on the declaration of a type variable (e.g., class MyClass<T> {...}). 
 * The ElementType.TYPE_USE target indicates that the annotation can be written on any use of a type 
 * (e.g., types appearing in declarations, generics, and casts).
 * There are two primary differences between type annotations and their predecessors. 
 * First, unlike declaration annotations, type annotations on the types of local variable declarations can also be retained in class files. Second, the full generic type is retained and is accessible at run-time.
 */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
/*
 * ElementType.TYPE_PARAMETER - this can be used on variable
   ElementType.TYPE_USE target indicates that the annotation can be written on any use of a type (e.g., types appearing in declarations, generics, and casts).
		Look for the other options of these.
		
*/
@interface Encrypted { 
	
	
}

public class Example02_TypeAnnotation {

	
	
}
