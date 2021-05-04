
public class Average2
{
	
	public static void main (String[] args)
	{
		double sum = 0;
		double n;
		int c = 0;
		do
		{
			n = IBIO.inputDouble("Enter a number (0 exits): ");
			if( n != 0 )
			{
				sum = sum + n;	// sum += n;
				c++;
			} else {
				IBIO.output("Thanks.");
			}
		} while(n != 0);
		IBIO.output("Inputs  = " + c );
		IBIO.output("Sum     = " + sum );
		IBIO.output("Average = " + (sum / c) );
	}
}

