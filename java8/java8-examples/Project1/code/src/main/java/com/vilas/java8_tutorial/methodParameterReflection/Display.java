package main.java.com.vilas.java8_tutorial.methodParameterReflection; 


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)

@interface MyAnnotation
{
	public String name();

	public String value();
}

public class Display
{

	public void doSomething(@MyAnnotation(name = "age",	value = "23") String value)
	{
		System.out.println("do something");
	}
}
