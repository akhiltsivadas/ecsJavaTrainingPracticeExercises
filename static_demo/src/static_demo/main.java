package static_demo;

 class mobile{
	
	String model;
	int price;
	 static String name;	
	public void  display() 
	{
		System.out.println(model+" "+price+" "+name);
		
	}
	
	//public static void mob1() {
		
		//System.out.println("inside void mob1");	
		
	//}
		
	}


public class main {	
	

	public static void main(String[] args) {
		
		mobile obj1=new mobile();
		obj1.model="n5110";
		obj1.price=10000;
		mobile.name="samsung"; // we don't need a object to call static type variable just use class
		
		mobile obj2=new mobile();
		obj2.model="N5520";
		obj2.price=20000;
		mobile.name="Apple"; // in the result both name of mobile will be same (APPLE LAST ASSIGNED) because name is defined as static variable it can't be changed with calling object
		//STATIC VARIABLE IS SHARED BY ALL THE OBJECT
		obj1.display();
		obj2.display();
		
		
		
		
	}

}
