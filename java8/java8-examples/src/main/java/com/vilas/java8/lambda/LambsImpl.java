package java8;

interface A{
	int show(String message);
}

interface AB{
	void show(String message);
}

class B implements A{
	public int show(String message) {
		System.out.println(message);
		return 10;
	}
}

public class LambsImpl {

	public static void main(String[] args)
	{
		LambsImpl l = new LambsImpl();
		l.traditionalMethod();
		l.innerClassMethod();
		l.lambdaMethod();
	}
	
	public void traditionalMethod() {
		//Traditional method
		A a = new B();
		a.show("Test");
	}
	
	public void innerClassMethod() {
		//With inner class
		A a1 = new A() {
			
			public int show(String message) {
				System.out.println("Inner Class "+message);
				return 0;
			}
		};
		int x = a1.show("Executing inner class method");
	}
	
	public void lambdaMethod() {
		//Lambda expression
		A a2 = (String message) ->
		{
			System.out.println("Inside lambda expression "+message);
			return 30;
		};
		int y = a2.show("Lambda expression");
		
		//Technically a return is fine. But it doesn't really makes sense
		
		A a3 = (s)->{
			System.out.println(s);
			return 0;
		};
		int z = a3.show("lambda without mentioning type in param");
	
		//If the method doesn't return a value, we can write it also as.
		//Else the only statement should be returning a value and you would not need it.
		AB ab = (S) -> System.out.println("test");

		//If there is only a single parameter - bracket is not required.
		AB ab1 = (s -> System.out.println("test));
	}
	
	
}