

class laptop
{
	String model;
	int price;
	
	public String toString() {   //manually controlling toString method
		return "hey";
		
	}
	
	public boolean equals(laptop that) 
	
	{
		
		return this.model.equals(that.model)&& this.price==that.price;
		
		
		
		
	}

	
	
}




public class main {

	public static void main(String[] args) 
	{
		
		
		laptop obj1=new laptop();	
		
		obj1.model="dell";
		obj1.price=67500;
		
		laptop obj2=new laptop();
		obj2.model="dell";
		obj2.price=67500;
		
		//System.out.println(obj1); //Every time you call obj1 along with obj toString method is also called System.out.println(obj1.toString()
		
		//System.out.println(obj1.toString());
		System.out.println(obj1);
		boolean result=obj1.equals(obj2);
		System.out.println(result);
		
		//check whether obj2=obj2;
	}

}
