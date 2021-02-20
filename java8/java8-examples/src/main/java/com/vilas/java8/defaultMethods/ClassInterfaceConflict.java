package java8;

interface I1{
	default void show() {
		System.out.println("In I");
	}
}

abstract class A1{
	public void show() {
		System.out.println("In A");
	}
}

public class ClassInterfaceConflict extends A1 implements I1{
	
	//Class takes precedence over interface if both have same method.
	public static void main(String args[]) {
		ClassInterfaceConflict ci = new ClassInterfaceConflict();
		ci.show();
	}
}
