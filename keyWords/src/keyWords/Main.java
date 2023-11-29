package keyWords;

public class Main 
{
	 //final keyword
	//..................
	//Final Keyword can be used with VARIABLES , METHODS AND CLASS . If we use it we can't change it later
	
	
	//this keyword
	//..................
	
	private int x;
	
	public void setter(int x)
	{
		//x=x; //black x is a local variable. blue is the instance variable . Basically we are assigning local variable to a local 
		//variable and not assigning to the private integer variable x. SO TO SOLVE THIS WE CAN USE this keyword. which tells that we are referring to 
		// instance variable x so we can write
		this.x=x;
	}
	
	
	
	
	
	
}
