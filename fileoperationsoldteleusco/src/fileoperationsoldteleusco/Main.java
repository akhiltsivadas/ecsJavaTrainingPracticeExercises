package fileoperationsoldteleusco;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) 
	{
		File file=new File("E:\\Akhil T S\\Technical training\\Java basic training\\Text_files_programs\\demo.txt");
		
		//WRITTING TO FILE
		try {
			
			FileOutputStream fileoutput=new FileOutputStream(file);
			DataOutputStream data=new DataOutputStream(fileoutput);
			data.writeUTF("Hello Word");
			data.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		//READING FROM FILE
		try 
		{
		  FileInputStream filePath=new  FileInputStream(file); 
		  DataInputStream data=new DataInputStream(filePath);
		  String str=DataInputStream.readUTF(data); // readUTF is a static method no need of object to call
		  System.out.println(str);
		  
		  
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
