/*
 * simple class that counts the number of digits of
 * a number (integer) that has been input
 * 
 * for information about printf:
 * https://www.baeldung.com/java-printstream-printf
 * https://alvinalexander.com/programming/printf-format-cheat-sheet/
 * 
 */
public class DigitCount
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter an int: ");
		int digits = 0;

		for(int i = n; i > 0; i=i/10)
		{	digits++;
		}

		System.out.printf("\n[for loop] %,d has %d digits.", n, digits);

		// using a while loop instead
		digits = 0;	// reset the digit counter
		int number = n;	// we copy the input number (n)
		// to another variable (numbers) that we will use to count the digits
		while(number > 0)
		{
			digits++; // digits = digits + 1;
			number = number / 10;
		}
			
		System.out.printf("\n[while loop] %,d has %d digits.", n, digits);
	}

}
