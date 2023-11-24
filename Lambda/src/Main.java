
@FunctionalInterface // This is an annotation functional interface have only one method
interface A {
	public int show(int i);
}

public class Main {

	public static void main(String[] args) {
		A sh =i->i+2; // Using lambda expressions we can reduce the code 
		sh.show(5);
	}
}