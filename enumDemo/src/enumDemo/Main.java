package enumDemo;

public class Main {
	enum Status    // enum is used to define constants can be used like below in the program
	{
	running,failed,reset
	}

	public static void main(String[] args) 
	{
		Status st=Status.running;
		System.out.println(st);
		System.out.println(st.ordinal()); // ordinal is a method to get index number of a enum
		Status ss[]=Status.values(); //values method gives all the values to an array
		System.out.println(ss[1]); // 
		
	}

}
