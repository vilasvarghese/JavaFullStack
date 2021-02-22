package main.java.com.vilas.java8_tutorial.methodreference;

interface Sayable{  
    void say();  
}  
public class MethodReference1 {

	    public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = () -> saySomething();
	        
	        //If all the lambda does is call a method, then that can be replaced by method reference
	        		
	        Sayable sayable1 = MethodReference1::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	        sayable1.say();
	    }  
}
