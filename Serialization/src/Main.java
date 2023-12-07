import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
	
	public static void main(String args[]) throws IOException
	{
		Student studentDetails=new Student();
		studentDetails.setRollNo(100392);
		studentDetails.setName("AKHIL TS");
		
		Student studentDetails2=new Student();
		studentDetails2.setRollNo(100393);
		studentDetails2.setName("Dijo");
		List<Student> studentList=new ArrayList<Student>();
		
		studentList.add(studentDetails);
		studentList.add(studentDetails2);
		
		
		College data=new College();
		data.setStudents(studentList);
		
		//WRITE XML 
		
		FileOutputStream fsteam=new FileOutputStream("E:\\Akhil T S\\Technical training\\Java basic training\\Text_files_programs\\1.xml");
		BufferedOutputStream stream=new BufferedOutputStream(fsteam);
		XMLEncoder x=new XMLEncoder(stream);
		x.writeObject(data);
		x.close();
		
		//READ XML
		
		FileInputStream fsteami=new FileInputStream("E:\\Akhil T S\\Technical training\\Java basic training\\Text_files_programs\\1.xml");
		BufferedInputStream streami=new BufferedInputStream(fsteami);
		XMLDecoder xi=new XMLDecoder(streami);
		College Xmldetails=new College();
		Xmldetails=(College)xi.readObject();
		System.out.println(Xmldetails);
		List<Student> s =new ArrayList<>();
		s=Xmldetails.getStudents();
		//PRINTING DECODED XML
		for(Student value:s)
		{
			System.out.println(value.getName());
			System.out.println(value.getRollNo());
		}
		
		
	}

}
