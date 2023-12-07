package lambdaLearn;

public class Main {

	public static void main(String[] args) 
	{
		Greeter gre=new Greeter();
		HellowordGreeting objHelloworld=new HellowordGreeting();
		gre.greet(objHelloworld);
		
		
		Greeting mylambda=()->System.out.println("hello");		
		mylambda.perfoam();

	}

}
