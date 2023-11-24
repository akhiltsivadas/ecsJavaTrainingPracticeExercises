
class A
{
	public void show1() 
	{
		System.out.println("IN SHOW 1");		
		
	}
}
class B extends A
{
	public void show2() 
	{
		System.out.println("IN SHOW 2");		
	}
}
	


public class main {

	public static void main(String[] args)
	{
		A obj1=(A) new B(); //UPCASTING
		obj1.show1();  
		
		B obj2=(B)obj1; //DOWN CASTING
		obj2.show2();
		
		
		
		
		
		

	}

}
