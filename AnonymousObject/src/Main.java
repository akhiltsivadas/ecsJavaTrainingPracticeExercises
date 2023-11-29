class A
{
	int k=4;
	public void print()
	{
		System.out.println("Printing"+k);
	}
}




public class Main {

	public static void main(String[] args) 
	{
		//A print=new A();// NORMAL REFERENCE . 
		//IF WE WANT TO USE AN OBJECT FOR ONLY 1 TIME USE ANOYMOUS OBJECT OTHERWISE THAT OBJECT WILL STAY IN MEMORY AND ALSO 
		//ITS NOT ELIGIBLE FOR GARNAGE COLLECTION
		
		new A().print(); // USING ANOMYMOUS OBJECT
		

	}

}
