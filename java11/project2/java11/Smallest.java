public class Smallest
{
	
	public static void main (String[] args)
	{
		int min = IBIO.inputInt("Enter a number: ");
		int n;
		int c = 0;
		while(true)
		{
			n = IBIO.inputInt("Enter a number (0 exits): ");
			if( n == 0 )
			{
				break;
			} else if(n < min)
			{	min = n;
			}
		}
		IBIO.output("Minimum  = " + min );
	}
}

