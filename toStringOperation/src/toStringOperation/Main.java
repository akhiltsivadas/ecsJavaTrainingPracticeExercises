package toStringOperation;

public class Main 
{

	public static void main(String[] args) 
	{
		
		Students details=new Students("akhil",12);    //STEP 3 : Lets pass values through constructor
		
		System.out.println(details); //STEP :1 toString method  is automatically called even if we don't write it 
		                                        //STEP 2: toString method belong to object class lets over ride it manipulate 
		System.out.println(details.toString()); //Note that above two line  have same result

	}

}

class Students
{
	int rollNo;
	String name;
	
	public Students(String name, int rollNo) //STEP 4: Create a constructor method 
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public String toString()   //STEP 5 : override and write toString method manually 
	{
		return name+":"+rollNo;
	}
	
	
	
}
