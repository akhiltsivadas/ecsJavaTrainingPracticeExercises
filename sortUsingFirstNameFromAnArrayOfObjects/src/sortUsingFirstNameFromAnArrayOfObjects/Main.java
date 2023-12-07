package sortUsingFirstNameFromAnArrayOfObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class People
{
	private String fName;
	private String Lname;
	private int age;
	public People(String fName,String Lname, int age) {
		super();
		this.fName=fName;
		this.Lname=Lname;
		this.age=age;
	}
	@Override
	public String toString() {
		return "People [fName=" + fName + ", Lname=" + Lname + ", age=" + age + "]";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	
}




public class Main {

	public static void main(String[] args) 
	{
		List<People> peopleObjectArray=Arrays.asList
				(		new People("AKHIL","TS",29),
						new People("RAHUL","T",28),
						new People("VIJAY","S",28),
						new People("DIJO","JACOB",26),
						new People("MIDHUN","DAS",35)
				);
		
		System.out.println(peopleObjectArray);
		
		Comparator compare=new Comparator<People>()
				{

					@Override
					public int compare(People o1, People o2) {
						// TODO Auto-generated method stub
						return o1.getfName().compareTo(o2.getfName());
					}
			
				};
		
		Collections.sort( peopleObjectArray,compare);
		
		for(People data:peopleObjectArray)
		{
			if(data.getfName().startsWith("M"))
			System.out.println(data);
		}
	
		
		
	}

}
