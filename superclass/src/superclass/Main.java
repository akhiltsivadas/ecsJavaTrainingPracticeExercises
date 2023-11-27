package superclass;

class A 
{
	public A() 
	{
		super(); // its there in every method but hidden . 	SUPER CLASS OF A METHOD IS OBJECT METHOD 
		System.out.println("in the constructor of A ");
	}
	public A(int k)
	{
		super(); // its there in every method but hidden
		System.out.println("in the constructor of A which accepts INT ");
	}
}

class B extends A 
{
	public B() 
	{
		super(); // its there in every method but hidden
		System.out.println("in the constructor of A ");
	}
	
	public B(int m)
	{
		super(); // its there in every method but hidden
		System.out.println("in the constructor of B which accepts INT ");
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		//A obj1=new A();
		//A obj1=new A(5);
		//B obj2=new B(); //when calling constructor of B there is super method which calls default method of parent class or supper class
         //lets try creating object which passes integer lets see what it does
		B obj2=new B(6); //Even if we have passed a value to the constructor the super method calls default constructor of A 
	}

}
