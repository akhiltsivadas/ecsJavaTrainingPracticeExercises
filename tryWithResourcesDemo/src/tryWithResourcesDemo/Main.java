package tryWithResourcesDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main 
{

	public static void main(String[] args) 
	{
		//InputStreamReader input=new InputStreamReader(System.in);		
		//BufferedReader br=new BufferedReader(input));
		
		
		//IN THE BELOW TRY BLOCK A RESOURCE CAN BE INTITIATED INSTEAD OF INITIATING IT BEFORE OR SEPERATLY ADVANTAGES OF DOING THIS
		//IS THAT WE DONT NEED TO CLOSE THE RESOURCES SEPERATLY IN THE FINAL BLOCK IT WILL AUTOMATICALLY CLOSED
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=br.readLine();
			System.out.println(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//THIS BELOW BLOCK DESNT NEEDED IF YOUR USING IT IN TRY BLOCK
		
		/*finally  
		{
			br.close();
		}
		*/
	}

}
