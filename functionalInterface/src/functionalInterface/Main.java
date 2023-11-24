package functionalInterface;

@FunctionalInterface        // This is an annotation functional interface have only one method
interface A
{
	public void show();
	
}



public class Main {

	/*public static void main(String[] args)  
	{
		A sh=new A() 
		{
			public void show()
			{
				System.out.println("in show");
			}
		};
		sh.show();
		
	}
	
	*/
	
	
	/*public static void main(String[] args) 
	{
		A sh=()->                                        //new A()  public void show is already known for the system so we can remove it and replace it with arrow 
			{											// This is called lambda 
				System.out.println("in show");
			};
		
		sh.show();
		
	}
   */
	
	public static void main(String[] args) 
	{
		A sh=()->System.out.println("in show");   //We can write this in one line
														
				
		
		
		sh.show();
		
	}

	
	
}
