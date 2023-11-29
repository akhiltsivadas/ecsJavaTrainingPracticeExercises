import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		String s3=s1.concat(s2); //Concatenation
		System.out.println("concatenated string:   "+s3);
		
		int length=s1.length();
		int lenght2=s2.length();
		System.out.println(length+lenght2);
		
		 s1=s1.toUpperCase();
		 System.out.println(s1);
		
	}

}
