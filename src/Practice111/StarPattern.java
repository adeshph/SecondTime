package Practice111;

public class StarPattern {

	public static void main(String[] args) 
	{
	/*
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<i; j++)
			{
				System.out.print("*");					
			}
			
			System.out.println();
		}
	*/
		
		// Reverse Star Pattern
		/*	
		for (int i=5; i>0; i--)
		{
			for (int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/	
		
		// Numbers pyramid
		
	/*	for (int i=1; i<5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);					
			}
			
			System.out.println();
		}
	*/
		for (int i=1; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				if (i==2 && j==2)
				{
					break;
				}
				System.out.println(" ( " + i + " , " + j + "  ) ");
			}	
		
			
					}

	}
}
