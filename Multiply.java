public class PP6_3 {

	public static void main(String[] args) 
	{
		// Write a program that produces a multiplication table, showing the results of multiplying the integers 1 through 12 by themselves.
		
		// Show headings
		System.out.println("\t\t\t\t\tMultiplication Table\n");
		for(int i=1; i <= 12; i++)
			System.out.print("\t" + i);
		
		// drop down to next row
		System.out.println();
		
		// show the rows
		for(int row = 1; row <= 12; row++)
		{
			// show row heading
			System.out.print(row + "\t");
			
			// show row columns
			for(int col = 1; col <= 12; col++)
			{
				System.out.print((row * col) + "\t");
			}
			
			// drop down to the next row
			System.out.println();
		}
	}

}
