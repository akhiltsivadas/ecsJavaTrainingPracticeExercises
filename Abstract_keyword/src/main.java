
abstract class Car //abstract methods can only be included in abstract class
{
	
	//public void drive();//instead of defining it you can declare if you don't know how to implement it along with the keyword abstract
	//so we can use abstract keyword
	public abstract void drive (); // abstract method can only be included in abstract class so changing again
	
	{
	
	
	}
	
	public void playMusic()
	{
		System.out.println("Music is playing");
	}


}

class wagonR extends Car  // drive was an idea before now its implementing for that we need inheritance
{
	
	public void drive()      
	{
		
		System.out.println("Car is driving ");
		
	}
	
	
	
}

public class main {

	public static void main(String[] args) 
	{
		
		//Car obj1=new Car(); // Abstract class can't have an object
		//Car obj2=new Car();  // abstract class can't have an object
		wagonR obj1=new wagonR();
		obj1.drive();
		obj1.playMusic();
		

	}

}
