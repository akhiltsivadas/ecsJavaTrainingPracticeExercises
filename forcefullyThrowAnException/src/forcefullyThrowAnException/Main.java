package forcefullyThrowAnException;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	
	{
		Scanner obj=new Scanner(System.in);
		
		try
		{
			
			int number=obj.nextInt();
			
			if(number<10)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Erro Enter Value Below 10");
		}
		catch(Exception e)
		{
			
		}
	}

}
