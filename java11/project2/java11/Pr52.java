/*
 * Problem 2, chapter 5 [5.2]
 * Write a program that it adds up the sequence
 */ 

public class Pr52
{
	public static void main(String args[])
	{
		double sum = 0;
		double x;

		for (int i = 1; i <= 100; i++)
		{
			x = i * i;
			sum = sum + (1/x);
			IBIO.output(x + "    " + sum);
		}
		IBIO.output("The total is " + sum);

	}
}
/*
The total is 1.6349839001848923
*/
