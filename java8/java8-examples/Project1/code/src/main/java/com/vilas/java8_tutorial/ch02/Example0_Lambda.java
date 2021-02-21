package main.java.com.vilas.java8_tutorial.ch02;

interface A1{
	int show(String message);
}

interface A1B{
	void show(String message);
}

class B1 implements A1{
	public int show(String message) {
		System.out.println(message);
		return 10;
	}
}

public class Example0_Lambda{

	public static void main(String[] args)
	{
		Example0_Lambda l = new Example0_Lambda();
		l.traditionalMethod();
		l.innerClassMethod();
		l.lambdaMethod();
	}
	
	public void traditionalMethod() {
		//Traditional method
		A1 a = new B1();
		a.show("Test");
	}
	
	public void innerClassMethod() {
		//With inner class
		A1 a1 = new A1() {
			
			public int show(String message) {
				System.out.println("Inner Class "+message);
				return 0;
			}
		};
		int x = a1.show("Executing inner class method");
	}
	
	public void lambdaMethod() {
		//Lambda expression
		A1 a2 = (String message) ->
		{
			System.out.println("Inside lambda expression "+message);
			return 30;
		};
		int y = a2.show("Lambda expression");
		
		//Technically a return is fine. But it doesn't really makes sense
		
		A1 a3 = (s)->{
			System.out.println(s);
			return 0;
		};
		int z = a3.show("lambda without mentioning type in param");
	
		//If the method doesn't return a value, we can write it also as.
		//Else the only statement should be returning a value and you would not need it.
		A1B ab = (S) -> System.out.println("test");

		//If there is only a single parameter - bracket is not required.
		A1B ab1 = (s -> System.out.println("test"));
	}
	
	
}