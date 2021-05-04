
public class Average
{
	
	public static void main (String[] args)
	{
		double sum = 0;
		int c = 0;
		do
		{
			double n = IBIO.inputDouble("Enter a number (0 exits): ");
			if( n == 0 )
			{	break;
			} else {
				sum = sum + n;	// sum += n;
				c++;
			}
		} while(true);
		IBIO.output("Inputs  = " + c );
		IBIO.output("Sum     = " + sum );
		IBIO.output("Average = " + (sum / c) );
	}
}

