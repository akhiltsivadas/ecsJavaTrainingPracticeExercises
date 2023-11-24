
class A{
	
	public void display() {
		
		System.out.println("IN CLASS A OUTSIDE");
	}
	
}




public class main {

	public static void main(String[] args) {
		
		A obj=new A()
				{
					public void display()    // THIS IS ANONYMOUS INNER LOOP WHICH DOESNT HAVE A NAME - IT OVERRIDE THE METHOD OUTSIDE CLASS MAIN -
					{
						System.out.println("IN CLASS MAIN ANONYMOUS INNER CLASS");
					}
			
			
				};
				
				
	obj.display();			
		

	}

}
