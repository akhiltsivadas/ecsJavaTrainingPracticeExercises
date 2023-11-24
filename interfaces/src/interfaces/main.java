package interfaces;

interface A
{
	//int a;         
	//String name;       // Varibles inside interface is FINAL AND STATIC SO IT MUST BE INITIALISED
	int age=28;         
	String name="akhil";
	
	public void show1();   // interface method are by default abstract and public
	 void show2(); // NOT REQUIRED TO SHOW PUBLIC
}

class B implements A  //IT IS MANDATORY TO IMPLEMENT THE METHODS .  IMPLEMENTS USING IN PLACE OF EXTENDS IN CASE OF INTRFACE CLASS
{
	
	
	
	public void show1()
	{
				System.out.println("SHOW ONE IMPLEMENTED");
	}
	
	public void show2()
	{
		System.out.println("SHOW TWO IMPLEMENTED");
	}
}

public class main {

	public static void main(String[] args) 
	{
		
		A obj=new B();
		obj.show1();
		obj.show2();
	System.out.println(A.age);  // AS VARIBLES INSIDE INTERFACE IS FIXED AND STATIC WE CAN DIRECTLY USE CLASS TO CALL age and name
	System.out.println(A.name);
		
		
		
		

	}

}
