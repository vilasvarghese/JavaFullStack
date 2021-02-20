package java8;

public interface InterfaceImplMethod {
	
	void add();//traditional public abstract method in Interface
	default void substract(int i, int j) {
		System.out.println(i - j);
	}
	
	
	//interface methods cannot override methods defined in
	//Object class. Hence an attempt to define below method
	//will result in compile time error.
	//default boolean equals(Object o) {}
}
