package countNoOfObjectsCreatedInaCLASS;
class Operations
{
	static int i; //i should be static so that every object can access it and if its not static while calling i every time it resets
	public  Operations()
	{
		i++;
	}
	
	public void counter()
	{
		System.out.println(i);
	}
	
}


public class Main 

{
	
	
	public static void main(String[] args)
	{
		Operations obj1=new Operations(); 
		Operations obj2=new Operations();
		Operations obj3=new Operations();
		Operations obj4=new Operations();
		
		obj4.counter();
	}

}
