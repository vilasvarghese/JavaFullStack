/*
 * Demonstrates the use of IF in Java
 * 
 * The list below shows the binary (you can only compare two items at one time) operators:
 * 
 * && means AND
 * || means OR
 * <, <=, ==, !=, >, >=
 * == compares it the two elements are the same or not
 * != means not equal to
 * 
 */
public class IfExamples
{
	
	public static void main (String[] args)
	{
		int number = IBIO.inputInt("Enter a number: ");
		System.out.println(number != 666 && number > 0);
		if(number != 666 && number > 0)
		{
			IBIO.output("Holy numbers, Batman!");
		}
		if(number == 666 || number < 0)
		{
			IBIO.output("Wicked.");
		}
		if(number < 0)
		{
			IBIO.output("Don't be so negative.");
		}
		if(number > 0)
		{
			IBIO.output("Looking positive today");
		}
		IBIO.output("The END");
	}
}

