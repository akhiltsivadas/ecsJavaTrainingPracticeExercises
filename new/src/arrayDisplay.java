import java.util.Scanner;

public class arrayDisplay {
	
	public void display_array() {
		
		
		int num[][]=new int[3][3];
		Scanner Scanner=new Scanner(System.in);
		System.out.println("ENTER ARRAY ELEMENTS");
		for(int i=0;i<3;i++) 
		{
			
			for(int j=0;j<3;j++)
			{
				
				num[i][j]=Scanner.nextInt();
				
				
				
			}
			
		}
		
		System.out.println("Array is=");
		
		for(int i=0;i<3;i++) 
		{
			
			for(int j=0;j<3;j++)
			{
				
				System.out.print(num[i][j]);
				System.out.print('\t');
				
				
				
				
			}
			System.out.print("\n");
			System.out.print("\n");
			
		}
		
		
		
		
	}
	
	

}
