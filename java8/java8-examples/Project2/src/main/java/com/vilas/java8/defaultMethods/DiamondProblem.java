package java8;

interface I{
	default void show() {
		System.out.println("In I");
	}
}

interface J{
	default void show() {
		System.out.println("In J");
	}
	
	//don't use default keyword for static methods.
	//default methods in interfaces are abstract.
	static void staticMethod() {
		System.out.println("This is a static method");
	}
}

public class DiamondProblem implements I, J{
	//I would be forced to provide implementation for show
	//as show implementation is present in both I and J
	public void show() {
		System.out.println("In DiamonProblem");
	}

	public static void main(String[] args) {
		DiamondProblem d = new DiamondProblem();
		d.show();
		J.staticMethod();
		
	}
}
