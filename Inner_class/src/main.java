class A{
	int a=0;
	String s="new";
	public void method1() 
	{
		System.out.println("IN CLASS A AND MEHOD 1");
	}
	
				class B
				{
					
					public void method2() 
					{
						System.out.println("IN CLASS B METHOD2 ");
					}				
					
				}
	
}




public class main {

	public static void main(String[] args) 
	{
		A obj1=new A();
		obj1.method1();
		//B obj2=new B(); // IT DOESNT WORK BECAUSE B INSIDE A SO WE CAN WRITE
		//A.B obj2=new A.B();// DOESNT WORK LIKE THIS . WE NEED OBJECT OF A TO ACCESS CLASS B. YOU CAN USE THIS METHOS IF YOUR USING STATIC CLASS
		//HERE  CHANGE CLASS B TO STATIC CLASS B IF THIS METHOD NEEDS TO BE WORK. IN STATIC METHOD WE DONT NEED OBJECT TO CALL 
		//NOTE:STATIC CAN BE ONLY BE USED FOR INNER CLASS
		A.B obj2=obj1.new B(); //OBJ1 IS THE OBJECT OF A . TO ACCESS B WE CAN USE obj1. new B()
		obj2.method2();
		
		
		

	}

}
