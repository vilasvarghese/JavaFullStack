/*
 * skeleton/simple class that calculates x to the power of y
 */
 
public class Power
{
	
	public static void main (String[] args)
	{
		int base = IBIO.inputInt("Base = ");
		int expo = IBIO.inputInt("Exponent = ");
		int exponent = expo;
		int power = 1;
		if(expo < 0)
		{	exponent = expo * -1;
		}
		for(int i = 0; i < exponent; i++)
		{
			power = power * base;
		}
		if(expo > 0)
		{	System.out.println(power);
		}
		if(expo < 0)
		{	System.out.println(1.0/power);
		}
	}
}

