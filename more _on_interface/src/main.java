
interface A
{
	void name();
	void age();
}
interface B
{
	void name2();
	void age2();	
}

class C implements A,B // MULTIPLE INTERFACES CAN BE USED UNLIKE ABSTRACT CLASS
{


	public void name2() 
	{
		System.out.println("NAME 2 IMPLEMENTED");
		
	}

	@Override
	public void age2() 
	{
		System.out.println("NAME 2 IMPLEMENTED");
		
	}

	
	public void name() 
	{
		System.out.println("NAME 2 IMPLEMENTED");
		
	}

	
	public void age() 
	{
		System.out.println("NAME 2 IMPLEMENTED");
		
	}
	
}




public class main 
{

	public static void main(String[] args) 
	
	{
		
		C obj=new C();
		obj.name();
		obj.age();
		obj.name2();
		obj.age2();
		

	}

}
