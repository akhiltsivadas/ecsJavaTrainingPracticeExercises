package method_over_riding;

class A
{
	public void test() {
		
		System.out.println("IN CLASS A");
		
	}
	
}


class B extends A{
	
	public void test() {                         //SAME method name and variables are required for method over riding
		
		System.out.println("IN CLASS B");
		
		
	}
	
}

public class main {

	public static void main(String[] args) 
	{
		
		A obj1=new A();
		B obj2=new B();
		
		obj1.test();
		obj2.test();
		
	

	}

}
