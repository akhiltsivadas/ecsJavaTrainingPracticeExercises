package superaskeyword;

class A
{
	int i=5;
}



class B extends A
{
	public void print()
	{
		int i=4;
		System.out.println(i);
		System.out.println(super.i); // IF SUPER KEYWORD IS USED IT WILL OVERRID THE I=4 AND GO FOR THE PARENT CLASS
		
	}
}






public class Main 
{

	public static void main(String[] args)
	{
	B obj=new B();
	obj.print();
	
	}

}
