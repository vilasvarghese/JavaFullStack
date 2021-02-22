package main.java.com.vilas.java8_tutorial.methodreference;


interface Formatter{
	String format(String str);
}

class CapitalFormatter implements Formatter
{
	@Override
	public String format(String str) {
		return str.toUpperCase();
	}
}

class LowerCaseFormatter implements Formatter
{
	@Override
	public String format(String str) {
		return str.toLowerCase();
	}
}


public class InstanceMethodReference {
	public static void main(String[] args) {
		Formatter f = new CapitalFormatter();
		print("Vilas", f::format);
		f = new LowerCaseFormatter();
		print("Vilas", f::format);
	}

	public static void print(String msg, Formatter formatter) {
		System.out.println(formatter.format(msg));
	}
}
