
public class Pr31
{
	
	public static void main (String[] args)
	{
		// declaration only
		int number;
		// do-while loop: post-check; do first, then repeat
		// if the expression is true
		do
		{
			number = IBIO.inputInt("Enter a number: "); //looped
		} while(number % 2 != 0 || number <= 0 || number >= 100 );
		IBIO.output("Thanks!");
		
		// break example (additional)
		while(true)
		{
			number = IBIO.inputInt("Enter a number: "); //looped
			if(number == 100)
			{
				IBIO.output("Error!");
				break;
			}
		}
	}
}

