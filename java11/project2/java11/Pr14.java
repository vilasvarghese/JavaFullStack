
public class Pr14
{
	
	public static void main (String[] args)
	{
		System.out.println("\nProblem 1.4 of the Java Worksheets - first 100 terms of the triangular sequence.");
		int term = 0;
		for(int i = 1; i <= 100; i++)
		{
			term = term + i;
			System.out.print(term + " ");
		}
	}
}

