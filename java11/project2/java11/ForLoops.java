
public class ForLoops
{
	
	public static void main (String[] args)
	{
		int i;
		IBIO.output("\n\nFor loops");
		for(i = 0; i < 10; i = i + 1)
		{
			if(i == 3)
				continue;
			IBIO.output( i + "    " + (i+1) );
		}
		IBIO.output( i + "\n" );
		
		for(i = 5; i < 15; i++)
		{
			IBIO.output( i + "    " + (i+1) );
			if(i == 13)
			{
				break;
			}
		}
		IBIO.output( i + "\n" );
		
		IBIO.output("\n\nWhile loops");
		
		int c = 0;
		while(c < 10)
		{
			IBIO.output( c + "    " + (c+1) );
			c = c + 1;
		}
		IBIO.output(c + "\n" );
		
		c = 5;
		do
		{	
			c = c + 1;
			if( c == 13 )
			{
				continue;
			}
			IBIO.output( c + "    " + (c+1) );
		} while(c < 15);
		IBIO.output(c + "\n" );
		
	}
}

/*

For loops
0    1
1    2
2    3
3    4
4    5
5    6
6    7
7    8
8    9
9    10
10

5    6
6    7
7    8
8    9
9    10
10    11
11    12
12    13
13    14
14    15
15



While loops
0    1
1    2
2    3
3    4
4    5
5    6
6    7
7    8
8    9
9    10
10

6    7
7    8
8    9
9    10
10    11
11    12
12    13
14    15
15    16
15


*/
 
