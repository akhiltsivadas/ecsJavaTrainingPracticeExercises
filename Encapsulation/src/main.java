

class encap
{
	
	private int age; // age and name is declared as a private o it can be accessed outside class 
	private String name;
	
				public void Set(int n, String na)  // to access these private variables we have created a method and which can access data from outside
				{
					
					age=n;							// n this way we set the values of age and name in directly
					name=na;
				}
				
				public int getAge() 	            // after setting values in name and age to access it we store values of age and name in another  			
				{									//variable and return this values once its called	
					
					int n=age;
					return n;					
				}
				
				public String getName() 				
				{
					
					String na=name;
					return na;					
				}
				
				//ACTUALLY WE ARE BINDING THE PRIVATE VARIBLES WITH METHODS TO ACCESS IT OUTSIDE CLASS. WE ARE ENCAPSULATING PRIATE VARIABLES AND METHODS
				
				
		
		
		
}



public class main 
	{
	

		public static void main(String[] args) 
		{
			encap obj1=new encap();
			obj1.Set(28, "AKHIL");
			
			
			System.out.println(obj1.getAge());
			System.out.println(obj1.getName());
			
	
		}

	}
