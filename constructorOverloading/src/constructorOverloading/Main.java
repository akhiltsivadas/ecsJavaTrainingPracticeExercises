package constructorOverloading;

class Demo
{
	public Demo(int c)    // In constructor return type is not mentioned. it wont return anything . it executes as soon as object is instantiated
	{
		System.out.print(c+" ");
		System.out.println("In demo 1");
	}
	
	public Demo()    // In constructor return type is not mentioned. it wont return anything . it executes as soon as object is instantiated. 
	{
		System.out.println("In demo 2");
		
	}
	
	
	
}

public class Main 
{

	public static void main(String[] args) 
	{
		int a=5;
		Demo obj=new Demo();  
		Demo obj2=new Demo(5);
	}

}
