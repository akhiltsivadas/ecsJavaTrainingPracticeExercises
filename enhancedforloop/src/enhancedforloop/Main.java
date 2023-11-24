package enhancedforloop;

public class Main 
{
   
	public static void main(String[] args) {
		int a[] = { 5, 4, 6, 7, 8, 6 };

		
		
		//ENHANCED FOR LOOP FOR PRINTING 1D array
		for (int i : a) 
		{
			System.out.print(i+" ");
		}

		
		
		
		
		int b[][] = 
			{

				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

			};
		System.out.println("");
		System.out.println("");
		// Using enhanced for loop for printing 2d array

		for (int i[] : b) // here each row of array is assigned to i
		{  
			for (int j : i) // i is an array now which contain first row so each value is assigned j now we can print j
			{
				System.out.print(j+" ");

			}
			System.out.println("");

		}

	}
}
