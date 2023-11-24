package abstract_class_anonymous_innr_class;

abstract class A
{
	public abstract void display();
	{
		
	}
}





public class main 
{

	public static void main(String[] args) 
	{
		
		A obj=new A() // NORMALLY WE CANT USE OBJEC OF A WHILE USING ABSTRACT CLASS BUT HERE IT IS CREATING OBJECT OF ANOYMOUS INNER CLASS
				{
			
					public  void display()
					{
						System.out.println("DISPLAYING STATUS");
					}		
			
				};
				
		obj.display();		
		
		
	}

}
