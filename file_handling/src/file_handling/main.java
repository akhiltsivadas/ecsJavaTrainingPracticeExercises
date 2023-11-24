package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class main {

	public static void main(String[] args) 
	
	{
		
		File f=new File("sample.txt");
		 
		try 
		{
			boolean b=f.createNewFile();
			if(b==true)
			{
				System.out.println("File created");
				
				
			}
			else 
			{
				System.out.println("File already exists");
			}
			
			
		 
		}
		catch(Exception e) 
		{
			System.out.println("Error occured");
		}
		
		try 
		{
			FileWriter fw=new FileWriter("sample.txt");
			fw.write("Hello world");
			fw.close();
			System.out.println("File writting succesful");
			
		}
		catch(Exception e)
		{
			System.out.println("An error occured while writing file");
		}
		
		char[] data=new char[15];
		
		
		try
		{
			FileReader fr =new FileReader("sample.txt");
			fr.read(data);
			fr.close();
			System.out.println(data);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("file reading unsuccesful");
			
		}	
		
		File fd=new File("sample.txt");
		fd.delete();
		System.out.println("File delete sucessful");
		
		
		
		
	}

}
