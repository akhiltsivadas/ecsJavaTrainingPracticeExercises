
class A implements Runnable
{

	@Override
	public void run() {
		System.out.println("In runnable");
		
	}
	
}





public class Main {
	
	
	public static void main(String args[])
	{
		//Normal method
	    Runnable obj=new A();
		Thread myThread=new Thread(obj); 	
		myThread.run();
		
		//Using lambda LOOK AT IT . IN ABOVE METHOD WE HAVE TO CREATE A CLASS A AND IMPLEMENT RUNNABLE TO AND PASS THAT OBJECT TO 
		//Thread But here using lambda we don't require to create a class. we can directly implement the runnable
		
		Thread myLambda=new Thread(()->System.out.println("in lambda runnable"));
		
		myLambda.run();
		
		
		
	}

}
